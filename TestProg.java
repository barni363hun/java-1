import java.util.function.Function;

class TestProg {
    public static void main(String[] args) {
        System.out.println("hello world");
        int x = 10;
        float y = (float) 3.1423;
        double z = 0;
        // x = 6.33;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        boolean cond = true;
        // if (cond) {
        if (x < 5) {
            System.out.println("t");
        } else {
            System.out.println("f");

        }
        asd();
    }

    static void asd() {
        System.out.println("asd");
    }
}