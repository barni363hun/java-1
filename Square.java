class Square {
    // constants
    // variables
    private double length;
    private double xPos, yPos;

    // constructors
    public Square(double length) {
        setLength(length);
    }

    public Square(double length, double x, double y) {
        setLength(length);
        setXPos(x);
        setYPos(y);
    }

    // methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("Problemo");
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return 4 * length;
    }

    public double getXPos() {
        return this.xPos;
    }

    public double getYPos() {
        return this.yPos;
    }

    public void setXPos(double x) {
        this.xPos = x;
    }

    public void setYPos(double y) {
        this.yPos = y;
    }

    public void moveTo(double x, double y) {
        // abszolút pozicionálás
        setXPos(x);
        setYPos(y);
    }

    public void translate(double dx, double dy) {
        this.xPos += dx;
        this.yPos += dy;
        // relatív pozicionálás
    }

    public void scale(double scaleFactor) {
        setLength(this.length * scaleFactor);
    }
}