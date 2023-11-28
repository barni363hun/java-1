import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Music extends Media {
    public int seconds;

    public Music(int _id, String _author,int _price, int _year,int _seconds) {
        super(_id, _author, _price, _year);
        this.seconds = _seconds;
    }

    public Music(String[] line){
        this(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]),Integer.parseInt(line[4]));
    }

    
    public void WriteItemsToFile(LinkedList<Music> items, String file, String separator){
        FileWriter f;
        try {
            f = new FileWriter(new File(file));
            for (Music item : items) {
                String line = "";
                line+=item.id+separator;
                line+=item.author+separator;
                line+=item.price+separator;
                line+=item.year+separator;
                line+=item.seconds+separator;
                f.write(line+"\n");
            }
            f.flush();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }
}
