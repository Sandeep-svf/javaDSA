package DSA.oop.oop2.staticExample;

// This is a demo to show static variable initialization...
public class StatiInit {
    static  int a = 4;
    static  int b = 6;
    static int c;

    // initiallzing static variable... make it sort of work...
    /// We can achieve this using static block
    // it is going to run exact one time once class is loaded.

    /// V Imp-will run once when the first object is created that is when class is loaded for the first time.
    static {
        System.out.println("I am in static block");
        c = a+b; // initializing c
    }

    public static void main(String[] args) {
        // StatiInit statiInit = new StatiInit();
        System.out.println(StatiInit.a);
        System.out.println(StatiInit.b);
        System.out.println(StatiInit.c);


       /// System.out.println();
        // println is methods and out is variabl and system is a class here.


    }



}
