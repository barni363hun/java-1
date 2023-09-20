class TestProg {
    public static void main(String[] args) {
        // System.out.println("hello world");
        // int x = 10;
        // float y = (float) 3.1423;
        // double z = 0;
        // // x = 6.33;
        // System.out.println(x);
        // System.out.println(y);
        // for (int i = 0; i < 10; i++) {
        // System.out.print(i + " ");
        // }
        // boolean cond = true;
        // // if (cond) {
        // if (x < 5) {
        // System.out.println("t");
        // } else {
        // System.out.println("f");

        // }
        TestProg obj = new TestProg();
        // obj.doSomething();
        Square a = new Square(4);
        System.out.println(a.getLenght());
    }

    void doSomething() {
        System.out.println("something");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        String[] days = new String[7];
        days[0] = "a";
        System.out.println(days.length);
        System.out.println(days[0]);
        for (String string : days) {
            System.out.println(string);
        }
    }
}