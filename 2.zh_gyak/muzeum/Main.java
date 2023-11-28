import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList<Room> rooms = new LinkedList<Room>();
		rooms.add(new Room("A",new String[]{"Painting1","Painting2","Painting3"}));
		rooms.add(new Room("B",new String[]{"Statue1","Statue2","Statue3"}));
		rooms.add(new Room("A",new String[]{"Photo1","Photo2","Photo3"}));

		System.out.println("Belépés a múzeumba");		
		for (Room r : rooms) {
			System.out.println(r.name+" szoba");
			for (String i : r.items) {
				System.out.println("elotted "+i);
				System.out.println("1. további információ megjelenítése");
				System.out.println("2. a tárgy képének kinyomtatása");
				System.out.println("3. másolat/reprint megvásárlása.");
				char key = waitForKey("g123");
				switch (key) {
					case '1':
						
						break;
				
					default:
						break;
				}
			}
		}
	}

    static private char waitForKey(String acceptables) {
		char userInput = 'ß';
		while (!acceptables.contains(String.valueOf(userInput))) {
			System.out.println("Nyomd meg a megfelelő gombot, majd az entert...");
            String input = sc.next();
            if (acceptables.contains(String.valueOf(input.charAt(0)))) {
                userInput = input.charAt(0);
            } 
		}
		return userInput;
    }
}