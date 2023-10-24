class Song 
{
    private String artistName;
    private String songName;  
    // Két legfontosabb dolog egy zeneszám eltárolásánál az előadó neve és a dal címe, több zenekarnak is lehet azonos dal címe, így meg lehet különböztetni két ugyanolyan nevű dalt
    // Ezeket lehetne még kiegészíteni a dal hosszával, műfajával, tempójával, time signaturjével és egyéb dolgokkal ha akarjuk.
    // és 4. feladatban kell is úgyhogy dalhossz: :D
    private int length;
    Song(String artistName, String songName, int length)
    {
        this.artistName = artistName;
        this.songName = songName;
        this.length = length;
    }
    public String getArtistName() { return artistName; }
    public String getSongName() { return songName; }
    public int getLength() { return length; }
    public void printSong()
    {
        System.out.println(artistName + " - " + songName + ", Length: " + length);
    }
}
