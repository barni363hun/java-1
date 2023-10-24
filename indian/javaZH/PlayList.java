import java.util.ArrayList;
class PlayList 
{
    private ArrayList<Song> songs;
    PlayList()
    {
        songs = new ArrayList<Song>();
    }
    public ArrayList<Song> getPlayList() { return songs; }   
    public void addToPlayList(Song s)
    {
        songs.add(s);
    }
    public Song get(int i)
    {
        try
        {
            return songs.get(i);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public int calculatePlayTime()
    {
        int sum = 0;
        for (Song song : songs) 
        {
            sum += song.getLength();
        }
        return sum;
    }

}
