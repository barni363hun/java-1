/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyi;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HALLGATO
 */
public class Zarthelyi {

    /**
     * @param args the command line arguments
     */
    List<Media> files = new ArrayList<>();
    History history = new History();

    public static void main(String[] args) {
        Zarthelyi app = new Zarthelyi();
        app.createTestFiles();
        System.out.println(app.files.size());
        while (true) {
            app.listCommands();
            String command = null;
            System.out.println("Choose a command!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                command = reader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Zarthelyi.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (command) {
                case "0":
                    app.exitApplication();
                    break;
                case "1":
                    app.printFiles();
                    break;
                case "2":
                    app.printFiles();
                    System.out.println("Which file would you like to play?");
                    try {
                        int index = Integer.parseInt(reader.readLine());
                        app.files.get(index - 1).play();
                        app.history.add(app.files.get(index - 1));
                    } catch (IOException ex) {
                        Logger.getLogger(Zarthelyi.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NumberFormatException ex) {
                        System.out.println("You have to give the number of the file!");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("There are no files with this number!");
                    }

                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }

    public void listCommands() {
        System.out.println("0. Exit the Application");
        System.out.println("1. List files");
        System.out.println("2. Play a file");
        System.out.println("3. Something");
    }

    public void createTestFiles() {
        files.add(new Music("song1.mp3", 36765, "C:/Desktop/music/song1.mp3", 243, "John Doe", "MySong"));
        files.add(new Music("song2.mp3", 36765, "C:/Desktop/music/song2.mp3", 352, "John Snow", "MySong But Cooler"));
        files.add(new Music("song3.mp3", 36765, "C:/Desktop/music/song3.mp3", 278, "John Snow", "MySong But Hotter"));
        files.add(new Music("song4.mp3", 36765, "C:/Desktop/music/song4.mp3", 291, "John Doe", "MySong2"));
        List<String> pages = new ArrayList<>();

        pages.add(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sodales efficitur nisi, ac volutpat leo varius vel. Nunc ut nulla eget erat feugiat efficitur. Duis orci nunc, luctus in erat eget, auctor condimentum mauris. Pellentesque dui diam, fermentum eu dignissim non, faucibus nec tortor. Curabitur id lacinia arcu. Mauris pellentesque quis tellus a bibendum. Aliquam elementum auctor magna in efficitur. Nunc elit lectus, sollicitudin ac finibus id, interdum vel mauris. Nulla aliquam, dui in varius ullamcorper, velit odio venenatis ligula, at pellentesque nunc augue ullamcorper metus. Aliquam sit amet vulputate felis. Fusce scelerisque, risus nec venenatis scelerisque, tellus neque ullamcorper eros, non malesuada dui quam et lorem. Aenean in arcu molestie, fermentum lectus et, maximus mauris. Cras facilisis velit sit amet fermentum tristique. Sed id nisl in odio interdum venenatis ut vitae erat. Etiam sed sapien non nisi scelerisque fermentum. ");
        pages.add(" Integer ex lectus, pretium ut sodales ut, egestas quis eros. Nullam ullamcorper ullamcorper nisl, eu luctus urna scelerisque ac. Morbi a massa nec ligula varius aliquet ut sit amet orci. Nam tempus ligula id velit efficitur facilisis. Etiam placerat lectus quis venenatis mollis. Cras vitae nunc quis tortor elementum ornare. Praesent quis hendrerit dui. ");
        pages.add(" Morbi maximus nibh id purus placerat tincidunt. Mauris neque purus, fermentum sit amet tortor sit amet, feugiat dapibus neque. Morbi faucibus venenatis bibendum. Sed iaculis lectus non elit dictum mollis. Praesent sed convallis urna. Phasellus commodo mollis eros ac ultricies. Vestibulum at ante et magna bibendum sagittis vitae et lacus. Duis hendrerit neque felis, sodales suscipit ipsum suscipit at. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean sollicitudin eu lectus non finibus. Ut feugiat felis vel tristique commodo. Nam a feugiat justo. Fusce dignissim ligula molestie, maximus elit ut, elementum felis. Nunc consectetur, erat a laoreet fermentum, eros ante mattis felis, id blandit dolor eros in arcu. Maecenas laoreet lectus vel nulla consequat, eu dictum mauris accumsan. Praesent aliquet sem a sem lobortis, et placerat tellus dapibus. ");
        pages.add(" Quisque dapibus feugiat ligula sed cursus. Aliquam maximus neque non erat elementum, sagittis condimentum quam semper. Cras vitae odio venenatis, tincidunt est eget, gravida justo. Vivamus ut gravida ligula. Ut vel purus porta est posuere venenatis. Cras vel vestibulum enim, vel pretium nisi. Cras venenatis nunc nisl, nec mattis libero ullamcorper eu. Etiam elementum non justo aliquet rhoncus. Maecenas auctor, lorem sed hendrerit sodales, tortor nisi imperdiet quam, id gravida est risus at risus. ");
        pages.add(" Vestibulum aliquet ligula aliquam, efficitur eros eu, ultricies diam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet sit amet lacus vitae imperdiet. Aenean in luctus odio, accumsan pharetra urna. Vivamus congue turpis risus, sed elementum est hendrerit ac. Praesent elementum orci eu turpis convallis, vitae rhoncus orci rutrum. Sed eros dui, luctus vitae imperdiet eu, elementum a mauris. ");

        files.add(new Book("Lorem_Ipsum.book", 132123, "C:/Desktop/books/Lorem_Ipsum.book", "Lorem Ipsum", pages));
        files.add(new Video("video1.mp4", 312312, "C:/Desktop/music/video1.mp4", "Cat Video", 2131, 480, 30));
        files.add(new Video("video2.mp4", 513245, "C:/Desktop/music/video2.mp4", "Cat Video", 534, 1080, 60));
    }

    public void printFiles() {
        for (int i = 0; i < files.size(); i++) {
            System.out.println((i + 1) + ".: " + files.get(i).toString());
        }
    }

    public void exportToFile() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream("files.txt"));
            for (Media m : files) {
                writer.println(m.toFile());
            }
        } catch (Exception e) {
        } finally {
            try {
                writer.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void exitApplication() {
        exportToFile();
        System.exit(0);
    }

}
