import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Museum {
    static Scanner sc = new Scanner(System.in);
    static String separator = ",";

    public Museum() {
        // LinkedList<Item> items = new LinkedList<Item>();
		// items.add(new Item(1,"Painting1","Enyém",1));
		// items.add(new Item(2,"Statue2","Nem enyém",2));
		// items.add(new Item(2,"Painting2","Nem enyém",1));
		// items.add(new Item(3,"Painting3","Nem tudom kié",1));
		// items.add(new Item(1,"Statue1","Enyém",2));
		// items.add(new Item(3,"Statue3","Nem tudom kié",2));
		// items.add(new Item(1,"Image1","Enyém",3));
		// items.add(new Item(2,"Image2","Nem enyém",3));
		// items.add(new Item(3,"Image3","Nem tudom kié",3));
        LinkedList<Item> items = ReadItemsFromFile("data.txt");

		items.sort(new ItemComparator());
        LinkedList<Item> printedItems = new LinkedList<Item>();


		System.out.println("Belépés a múzeumba");
        for (int i = 1; i < 4; i++){
		 	System.out.println(i+". szoba");
            LinkedList<Item> filteredItems = new LinkedList<>();
            for (Item item : items) {
                if (item.room == i) {
                    filteredItems.add(item);
                }
            }
            for (Item item : filteredItems) {
                boolean next = false;
                while (!next) {
                    System.out.println("elotted "+item.name);
                    System.out.println("1. további információ megjelenítése");
                    System.out.println("2. a tárgy képének kinyomtatása");
                    System.out.println("3. másolat/reprint megvásárlása.");
                    switch (waitForKey("123g")) {
                    case 'g':
                        next = true;
                        break;
                    case '1':
                        item.printData();
                        break;
                    case '2':
                        printedItems.add(item);
                        System.out.println("Kép kinyomtatva!");
                        break;
                    case '3':
                        printedItems.add(item);
                        System.out.println("Másolat/reprint megvásárlása!");
                        break;
                    default:
                        break;
                }
                }
                
            }
        }
        WriteItemsToFile(printedItems, "order.txt");

    }
    
    static private char waitForKey(String acceptables) {
		char userInput = 'ß';
		while (!acceptables.contains(String.valueOf(userInput))) {
			System.out.println("Nyomd meg a megfelelo gombot, majd az entert...");
            String input = sc.next();
            if (acceptables.contains(String.valueOf(input.charAt(0)))) {
                userInput = input.charAt(0);
            } 
		}
		return userInput;
    }

    static private LinkedList<Item> ReadItemsFromFile(String file){
        LinkedList<Item> res = new LinkedList<Item>();
        try {
        BufferedReader f = new BufferedReader(new FileReader(new File(file)));
        String input;
            while ((input = f.readLine()) != null) {
                String[] line = input.split(separator);
                res.add(new Item(Integer.parseInt(line[0]),line[1],line[2],Integer.parseInt(line[3])));
            }
        } catch (Exception e) {
            System.out.println("Nem írtál valamit el?");
        }
        return res;
    }

    
    static private void WriteItemsToFile(LinkedList<Item> items, String file){
        FileWriter f;
        try {
            f = new FileWriter(new File(file));
            for (Item item : items) {
                String line = "";
                line+=item.id+separator;
                line+=item.name+separator;
                line+=item.desc+separator;
                line+=item.room+separator;
                f.write(line+"\n");
            }
            f.flush();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
