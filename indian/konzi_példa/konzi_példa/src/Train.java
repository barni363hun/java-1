import java.io.*;

class Train {
    // a tömb kezeléséhez segédváltozók
    // Collection használata ajánlott
    private final int maxCarts = 5;
    private int cartEnd = 0;


    // adattagok
    private Locomotive locomotive;    
    private Cart[] carts;
    private Station departure, terminal;


    // Minimál konstruktor
    public Train(Locomotive locomotive) {
        this(locomotive,null, null);
    }

    // Minden adattagot beállító konstruktor
    private Train(Locomotive locomotive, Station departure, Station terminal) {
        this.locomotive = locomotive;
        this.carts = new Cart[maxCarts];
        this.departure = departure;
        this.terminal = terminal;
    }

    // Vagon hozzáadása
    public void addCart(Cart c) {
        if (cartEnd < carts.length);
            this.carts[cartEnd] = c;
        cartEnd++;
    }

    // Vonat indítása
    public void depart(Station from, Station to) {
        this.departure = from;
        this.terminal = to;

        // kis extra fájlba kiírás
        PrintWriter writer = null;
        try {
            // a PrintWriter direkt szöveges állományokhoz való
            // lehet használni BufferedWriter-t is, de ez a megoldás kényelmesebb
            writer = new PrintWriter(new FileWriter("log.txt", true));
            writer.println(String.format("Train departed from %s to %s\n", from, to));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Összegzés tételével teljes kapacitás megállapítása
    public int totalSeats() {
        int acc = 0;
        for (int i=0;i<cartEnd;i++) 
            acc += carts[i].getSeats();
        return acc;
    }

    // delegált lekérdezés a mozdonynak
    public double maxSpeed() {
        return locomotive.getSpeed();
    }

    // A menüben a kiíratáshoz
    // minden osztály az Object osztály leszármazottja, annak 
    // metódusa a toString
    @Override
    public String toString() {
        // formázás konkatenálással
        String res = "";
        res = res + locomotive.getIdentifier() + " ";
        res = res + "| ";
        for (int i=0;i<cartEnd;i++) {
            res = res + carts[i].getCode()+ " ";
        }
        return res;
    }
}
