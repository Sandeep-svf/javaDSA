package DSA.oop.oop2.singlton;

public class Singleton {
    /// It is a class in which we can create only one object of it.

    /// How to achieve this...
    /***
     It we want  to make only one obj can be created of a class then you should not allow it to call the constructor
     of this class by making it private. (Bcoz whenever we will call constructor new object will be created.)


     */

   private Singleton(){}  // can not call by any other class now this constructor.

    /// only one obj can be created and in this class only.

    private static Singleton instance;

    /// now we will create a function that will give instance.

    public static Singleton getInstance (){

        // check weather one obj is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }



}
