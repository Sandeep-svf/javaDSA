package DSA.oop.oop3.Polymorphism;

public class ObjectPrint { ///  by default all calss extend to Object class i.e. class ObjectPrint extends Object

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }


    // toStirng methods


    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {

        ObjectPrint objectPrint = new ObjectPrint(5);
        /// printing obj
        /// here, println print obj of to string methods.
        /// but we do not have toStirng methods in to our class
        /// we know all call extend Object class
        /// it will print by default this one toStirng methods which will give some hash value.
        System.out.println(objectPrint);  // output-> DSA.oop.oop3.Polymorphism.ObjectPrint@2c7b84de

        // what if i provide toString method


        /**

         @Override
         public String toString() {
         return "ObjectPrint{" +
         "num=" + num +
         '}';
         }

         here we are overriding toString methods.
         now it will call out toString methods not form object calss default one.

         and at runtime it is deciding it which one to call.
         bcoz it control click on println it go to default one not the one toString methods we have in out class
         bcoz it is deciding / resolving at runtime.

         this is default one it will take

         public void println(Object x) {
         String s = String.valueOf(x);
         if (getClass() == PrintStream.class) {
         // need to apply String.valueOf again since first invocation
         // might return null
         writeln(String.valueOf(s));
         } else {
         synchronized (this) {
         print(s);
         newLine();
         }
         }
         }
        */




    }
}
