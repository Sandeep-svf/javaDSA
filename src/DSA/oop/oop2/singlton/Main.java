package DSA.oop.oop2.singlton;

public class Main {

    public static void main(String[] args) {
      ///  Singleton singleton = new Singleton();
        /// singleton calss constructor is private to can not call it here becoz it create obj and singleton can have only
        ///  one obj.

        /// and that one class can be called in the Singleton class only.

        // so will use funcitn to get instance
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();


        /// Note- all three reference variable are pointing to the same object.

    }
}
