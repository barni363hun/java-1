import java.io.File;
import java.io.File;

class Playlist {
    Music[] musicArray;
    
    public Playlist(Music[] musicArray){
        this.musicArray = musicArray;
    }
    public Playlist(String filename){
        int i = 0;
        BufferedReader r = new BufferedReader(new FileReader(new File(filename)));
        String line = "";
        while((line = r.readLine())!=null){
            String[] data = line.split(";");
            this.musicArray[i] = new Music(data[0]...);
            /*
            Double.parseDouble
            Integer.parseInt
             */
            i++;
        }
    }

    public void printPlaylist(){
        for(int i=0; i<musicArray.length;i++){
            System.out.println("Cím: "+musicArray[i].title);
            System.out.println("Zenekar: "+musicArray[i].band);
            System.out.println("Ido (másodpercben): "+musicArray[i].lenghtSec);
        }
    }
}
