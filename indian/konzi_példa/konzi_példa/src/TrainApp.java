import java.io.*;

class TrainApp {

    // rendszerben tárolt adatok
    Train[] trains;
    Station[] stations;

    public static void main(String[] args) {
        // önmagából létrehoz egy példányt és ráhívja az indítófüggvényt
        new TrainApp().start();
    }

    // konstruktor az adatfeltöltéshez
    public TrainApp() {
        trains = new Train[5];

        trains[0] = readTrainFromFile("szemely.txt");
        trains[1] = readTrainFromFile("gocsej.txt");
        trains[2] = readTrainFromFile("mellek.txt");


        stations = new Station[] {
            new Station("Veszprém", 0.0, 0.1),
            new Station("Budapest Déli", 69, 420),
            new Station("Győr", 123, 123)
        };
    }

    // File I/O
    private Train readTrainFromFile(String filename) {
        // ugyanolyan BufferedReader mint terminálos inputnál
        BufferedReader fileReader = null;

        // adatok, amiket a try-ban beállítunk
        Locomotive locomotive = null;
        Cart[] carts = new Cart[5];
        int cartIndex = 0;
        Train res = null;
        try {
            // Buffered reader most nem InputStreamReader-t kap, hanem FileReader-t,
            // amihez kell egy létező file is.
            fileReader = new BufferedReader(new FileReader(new File(filename)));
            String line;
            // a while egyszerre beolvas egy sort és null-checkel,
            // mert a BufferedReader null-t ad vissza, ha nincs több sor
            while ((line = fileReader.readLine()) != null) {
                // szétválasztjuk a sort szavakra
                // majd létre hozunk vonatokat, vagy kocsikat 
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "L":
                       locomotive = new Locomotive(tokens[1], Double.parseDouble(tokens[2]));
                       break;
                    case "C":
                        carts[cartIndex] = new Cart(tokens[1], Integer.parseInt(tokens[2]));
                        cartIndex++;
                        break;
                    default:
                        break;
                }
            }
            // a beolvasott adatokkal létrehozzuk a vonatot és hozzáadjuk a kocsikat
            res = new Train(locomotive);
            for (int i=0;i<cartIndex;i++) {
                res.addCart(carts[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                System.err.println("UNREACHABLE");
                e.printStackTrace();
            }
        }
        return res;
    }

    // saját indítófüggvény
    public void start() {
        // létrehozzuk a reader-t, amit a többi függvény is használhat
        BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
        // csinálunk egy event-loop-ot
        boolean active = true;
        try {
            // amíg a felhasználó a kilépést nem választja, 
            // megjelenítjük a menüt és várunk az inputra
            while (active)
                active = mainMenu(keyboardReader);
            keyboardReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private boolean mainMenu(BufferedReader reader) throws IOException {
        // Opciók kiírása
        System.out.println("---------------------------------------");
        System.out.print("0: quit\n1: list trains\n2: start train\n> ");
        // Felhasználói input beolvasása
        String choise = reader.readLine();
        // üzleti logika
        switch (choise) {
            case "0":
                return false;
            case "1":
                listTrains();
                break;
            case "2":
                startTrain(reader);
                break;
            default:
                System.err.println("Unknown option");
                break;
        }
        return true;
    }

    // a nem null vonatok kilistázása a tömbből
    // collection használatával ez is könnyebb lenne
    private void listTrains() {
        for (int i=0;i<trains.length;i++) {
            if (trains[i] != null)
                System.out.println(i + ": " + trains[i] + " | " + trains[i].maxSpeed() + "km/h, " + trains[i].totalSeats() + " seats");
        }
    }

    // a nem null állomások kilistázása a tömbből
    // collection használatával ez is könnyebb lenne
    private void listStations() {
        for (int i=0;i<stations.length;i++) {
            if (stations[i] != null)
                System.out.println(String.format("%d: %s", i, stations[i].getName()));
        }
    }

    // egy vonat elindítása = a felhasználó kiválaszt két állomást, amit beadunk a vonatnak
    // ez a függvény is fentről kapja a reader-t
    private void startTrain(BufferedReader reader) throws IOException {
        // felhasználói inputok beolvasása
        System.out.println("Select train!");
        listTrains();
        System.out.print("> ");
        int train = Integer.parseInt(reader.readLine());

        System.out.println("Select departure station!");
        listStations();
        System.out.print("> ");
        int dep = Integer.parseInt(reader.readLine());

        System.out.println("Select terminal station!");
        listStations();
        System.out.print("> ");
        int term = Integer.parseInt(reader.readLine());

        // ha valid számokat adott meg a felhasználó
        if (train < trains.length && dep < stations.length && term < stations.length) {
            if (trains[train] != null && stations[dep] != null && stations[term] != null) {
                // akkor elindítjuk a vonatot
                trains[train].depart(stations[dep], stations[term]);
                System.out.println("Train started successfully!");
            } else {
                // különben megkínáljuk egy hasznos és pontos hibajelenséget 
                // leíró error üzenettel
                System.err.println("Error :(");
            }
        } else {
            System.err.println("Error :(");
        }
    }
}