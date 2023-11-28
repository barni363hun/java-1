public class Book extends Media {
    public int weightInGrams;
    public Book(int _id, String _author,int _price, int _year,int weightInGrams) {
        super(_id, _author, _price, _year);
        this.weightInGrams = weightInGrams;
    }
}
