package DSA.recursion.part1;

public class Rec1 {

    public static void main(String[] args) {

        // write a function that prints hello words
        message();

        // print hellow word five times
        /*message();
        message();
        message();
        message();
        message();*/

        // only one function and print five times with one function and one time calling also only one print in
        // the function.



    }

    static void message() {
        System.out.println("Hello World 0");
        message1();
    }

    private static void message1() {
        System.out.println("Hello World 1");
        message2();
    }

    private static void message2() {
        System.out.println("Hello World 2");
        message3();
    }

    private static void message3() {
        System.out.println("Hello World 3");
        message4();
    }

    private static void message4() {
        System.out.println("Hello World 4");
    }
}
