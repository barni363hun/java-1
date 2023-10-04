
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*;

class TestProg {
    public static void main(String[] args) {
        TestProg obj = new TestProg();
        obj.squareTest();

        /*
         * //obj.week1();
         * //obj.doSomething();
         * // ****** user input
         * // BufferedReader keyboard = new BufferedReader(
         * // new InputStreamReader(System.in));
         * double size = 0;
         * PrintWriter outFile = null;
         * try{
         * // file input
         * BufferedReader inFile = new BufferedReader(
         * new FileReader("data.txt"));
         * //System.out.print("Enter size of the square: ");
         * String input = null;
         * int count = 0;
         * while ((input = inFile.readLine()) != null){
         * //System.out.println("length: " + input);
         * size = Double.valueOf(input);
         * Square sq = new Square(size);
         * //sq.setLength(-10);
         * System.out.println(
         * "length: " + sq.getLength() +
         * " area: " + sq.area());
         * count ++;
         * }
         * String msg = "Created " + count + " squares.";
         * System.out.println(msg);
         * outFile = new PrintWriter("output.txt");
         * outFile.println(msg);
         * }catch(NumberFormatException ex){
         * System.out.println("Wrong input!");
         * //ex.printStackTrace();
         * }catch(IOException ex){
         * ex.printStackTrace();
         * }finally{
         * if (outFile != null) outFile.close();
         * }
         */
    }

    void week1() {
        System.out.println("Hello");
        int x = 10;
        float y = 3.948888f;
        double z = 0;
        y = (float) z;
        // x = 3.55;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            // System.out.print(" ");
        }
        System.out.println("value of x: " + x +
                ", value of y: " + y);
        boolean cond = true;
        // if (cond) {
        if (x < 5) {
            System.out.println("true branch");
        } else {
            System.out.println("false branch");
        }
    }

    void doSomething() {
        System.out.println("performing array tests...");
        final int length = 10;
        int[] numbers = new int[length];
        // length +=3;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // String array sample
        String[] days = { "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < days.length; i++) {
            // days[i] = ;
            System.out.println(
                    days[i].toUpperCase().toLowerCase());
        }
        String msg = days[0].concat(" is tough");
        System.out.println("msg: " + msg);
        if (msg.contains("is")) {
            System.out.println("substring found");
        }

        System.out.println(
                msg.replace("Monday", "Programming"));
    }

    void squareTest() {
        Square s = new Square(1.0);
        System.out.println("x: " + s.getXPos() + ", y: " + s.getYPos() + ", lenght: " + s.getLength());
        s.translate(2.0, 5.0);
        // String line = String.format("x:
        // %.2f",s.getXPos()/*,s.getYPos(),s.getLenght()*/);
        System.out.println("x: " + s.getXPos() + ", y: " + s.getYPos() + ", lenght: " + s.getLength());
        s.scale(2);
        System.out.println("x: " + s.getXPos() + ", y: " + s.getYPos() + ", lenght: " + s.getLength());
        Square s2 = new Square(1.2, 1.0, 1.0);

        System.out.println("x: " + s2.getXPos() + ", y: " + s2.getYPos() + ", lenght: " + s2.getLength());
        // System.out.println(Square);
        System.out.println(distance(s.getXPos(), s.getYPos(), s2.getXPos(), s2.getYPos()));
    }

    double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

}