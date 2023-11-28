public class PhotoAlbum extends Media {
    public String[] images;
    public PhotoAlbum(int _id, String _author,int _price, int _year,String[] _images) {
        super(_id, _author, _price, _year);
        this.images = _images;
    }
}
