public class Video extends Media {
    public String resolution;
    
    public Video(int _id, String _author,int _price, int _year,String _resolution) {
        super(_id, _author, _price, _year);
        this.resolution = _resolution;
    }
}
