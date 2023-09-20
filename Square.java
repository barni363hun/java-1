public class Square {
    private double lenght;

    public Square(double lenght) {
        lenght = this.lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double setLenght(double lenght) {
        return lenght = this.lenght;
    }

    public double area() {
        return lenght * lenght;
    }

    public double perimeter() {
        return 4 * lenght;
    }
}
