import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class MultiMedia{
    static Scanner sc = new Scanner(System.in);
    static String separator = ",";
    public static void main(String[] args) {
        MultiMedia m = new MultiMedia();
        LinkedList<Media> medias = new LinkedList<Media>();
        int i = 0;
        // medias.add(new Music(i++,"John Doe",1000,2005,286));
        // medias.add(new Music(i++,"Don Joe",2000,2000,420));
        // medias.add(new Music(i++,"Chuck Norris",10000,1998,150));
        // medias.add(new Book(i++,"John Doe",10000,2005,1005));
        // medias.add(new Book(i++,"Don Joe",20000,2000,1235));
        // medias.add(new Book(i++,"Chuck Norris",100000,1998,2005));
        medias.addAll(ReadFromFile("data.csv",Music.class));
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

    static private <T> LinkedList<T> ReadFromFile(String file, Class<T> reflector){
        LinkedList<T> res = new LinkedList<T>();
        try {
            BufferedReader f = new BufferedReader(new FileReader(new File(file)));
            String input;
            while ((input = f.readLine()) != null) {
                String[] line = input.split(separator);
                T instance = reflector.getDeclaredConstructor(String[].class).newInstance((Object) line);
                res.add(instance);
            }
        } catch (Exception e) {
            System.out.println("Nem írtál valamit el?");
        }
        return res;
    }

}