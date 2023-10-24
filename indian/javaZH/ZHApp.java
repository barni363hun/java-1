import java.util.ArrayList;
import java.io.*;
class ZHApp
{
    private PlayList myPlayList = new PlayList();
    static public void main(String args[])
    {
        ZHApp obj = new ZHApp();
        System.out.println("1. feladat:");
        obj.calulateSumOfFirstN();
        System.out.println();
        String[] words = new String[] {"Java", "Object", "Class", "Compiler"};
        System.out.println("2. feladat: ");
        obj.printStringArray(words);
        System.out.println();
        System.out.println("3, 4 es 5. feladatok: ");
        obj.readPlayListFromFile("songs.txt");
        obj.printPlayList();
        System.out.println();
        obj.startMusicApp();
    }
    public void startMusicApp()
    {
        String menu = "1";
        while (!menu.equals("0"))
        {
            printMenuOptions();
            menu = System.console().readLine();
            switch (menu) 
            {
                case "0": exitApplication();
                    break;
                case "1": printPlayList();
                    break;
                case "2": addSongToPlaylist();
                    break;
                default: System.out.println("Unknown option!");
                    break;
            }
        }
    }
    public void addSongToPlaylist()
    {
        try 
        {
            myPlayList.addToPlayList(new Song(
                System.console().readLine("Enter the name of the artist!\n"),
                System.console().readLine("Enter the name of the song!\n"),
                Integer.parseInt(System.console().readLine("Enter the length of the song!\n"))
            ));     
        } 
        catch (NumberFormatException e) 
        {
            e.printStackTrace();
        }
    }
    public void printMenuOptions()
    {
        System.out.println("0: Exit application");
        System.out.println("1: List playlist");
        System.out.println("2: Add a new song");
    }
    public void exitApplication()
    {
        saveChanges();
        System.exit(0);
    }
    public void saveChanges()
    {
        /* Export myPlayList to songs.txt */
        PrintWriter writer = null;
        try 
        {
            writer = new PrintWriter("songs.txt");
            for (Song song : myPlayList.getPlayList()) 
            {
                writer.println(song.getArtistName() + ";" + song.getSongName() + ";" + song.getLength());
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void calulateSumOfFirstN()
    {
        System.out.println("sumOfFirstNIntegers(5) = " + sumOfFirstNIntegers(5));
        System.out.println("sumOfFirstNIntegersBasicMethod(5) = " + sumOfFirstNIntegersBasicMethod(5));
        System.out.println("sumOfFirstNIntegers(6) = " + sumOfFirstNIntegers(6));
        System.out.println("sumOfFirstNIntegersBasicMethod(6) = " + sumOfFirstNIntegersBasicMethod(6));
        System.out.println("sumOfFirstNIntegers(7) = " + sumOfFirstNIntegers(7));
        System.out.println("sumOfFirstNIntegersBasicMethod(7) = " + sumOfFirstNIntegersBasicMethod(7));
        System.out.println("sumOfFirstNIntegers(10) = " + sumOfFirstNIntegers(10));
        System.out.println("sumOfFirstNIntegersBasicMethod(10) = " + sumOfFirstNIntegersBasicMethod(10));
        System.out.println("sumOfFirstNIntegers(53) = " + sumOfFirstNIntegers(53));
        System.out.println("sumOfFirstNIntegersBasicMethod(53) = " + sumOfFirstNIntegersBasicMethod(53));
    }
    public void readPlayListFromFile(String filename)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(new File(filename)));
            String line;
            myPlayList = new PlayList();
            while ((line = reader.readLine()) != null)
            {
                String[] lineElements = line.split(";");
                try 
                {
                    myPlayList.addToPlayList(new Song(
                        lineElements[0],
                        lineElements[1],
                        Integer.parseInt(lineElements[2])
                    ));
                } 
                catch (NumberFormatException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public int sumOfFirstNIntegers(int n)
    {
        return n*(n+1)/2;
    }
    public int sumOfFirstNIntegersBasicMethod(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        return sum;
    }
    public void printStringArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if ((i+1) % 2 == 0)
            {
                System.out.println(arr[i].toUpperCase());
            }
            else
            {
                System.out.println(arr[i].toLowerCase());
            }
        }
    }
    public void createPlayList()
    {
        myPlayList.addToPlayList(new Song("Hammerfall", "Hearts on Fire", 213));
        myPlayList.addToPlayList(new Song("Hammerfall", "Blood Bound", 267));
        myPlayList.addToPlayList(new Song("Cattle Decapitation", "Be Still our Bleeding Hearts", 314));
        myPlayList.addToPlayList(new Song("Kreator", "Fallen Brother", 312));
        myPlayList.addToPlayList(new Song("Burzum", "Ea, Lord of depths", 514));
        myPlayList.addToPlayList(new Song("Vivaldi", "4 seasons: summer: storm", 415));
    }
    public void printPlayList()
    {
        for(Song song : myPlayList.getPlayList())
        {
            song.printSong();
        }
        System.out.println("Total length of the playList in seconds: " + myPlayList.calculatePlayTime());
    }
}