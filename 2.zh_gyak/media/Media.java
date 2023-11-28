import java.util.LinkedList;

public abstract class Media {
    public int id;
    public String author;
    public int price;
    public int year;

    public Media(int _id, String _author,int _price, int _year) {
        this.id = _id;
        this.author = _author;
        this.price = _price;
        this.year = _year;
    }

    abstract void play();

}
