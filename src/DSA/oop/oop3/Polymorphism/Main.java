package DSA.oop.oop3.Polymorphism;

public class Main {

    // Polymorphism
    /*

    Poly - Many
    Morphism - way to represent

    means-> Many ways to represent Single entity or items.
    (Act of representing the same things in multiple ways.i.e. constructor call with different parameter type
    but same class name.)

    how it occurs-> It occurs during Inheritance.

    // Real world example--



    */

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Squar squar = new Squar();

        /// First see does area exist shape obj. already cover in inheritance.
        shape.area();

        circle.area();

        squar.area();

        /// types of polymorphism
        /***

         1-> Static (Compile time) Polymorphism -> Achieve by method over loading.

         what is method overloading -> When class have multiple methods with the same name but the types, arguments ,
         return type, ordering (order of the type) can be different.
         i.g. Multiple Constructor.
         A aObj = new A();
         A a1Obj = new A(5);

         This is known as Compile time polymorphism.



         */

        /**
         2-> Runtime (dynamic Polymorphism) -> Achieve by method overriding.

         When the funcitn in parent class and child class is the same and only the body is different is called
         method overriding.

         // Method overriding.
         Parent obj = new Child();
         here which methods will be called depends on (Child type of obj) new Child();.
         This is known as upcasting.
         this entire things known as how overriding happend.

         Shape shapeObj = new Circle();

         how does java know which particular function to run...( same fn name have in parent and child class)
         How it internally words and memory allocation happened ->

         // here we know object type ( which is child) will define which one to run... new Circle();
         // and reference type define which one it can access ( parent ) lest side ...  Shape shapeObj

         // means parent will say you can access area but which version of area can be access defin by child object.

         how java determines this?
         -> java determines it with something known as Dynamic method dispatch.   VV-IMP

         Dynamic method dispatch - ( It is just a mechanism by which a call to an overridden method is resolved at runtime
         rather than compline time.)



         FACTS------------------FACTS----------FACTS----------------FACTS--------------FACTS------------FACTS------------

         FINAL KEYWORDS-------
         1--------------------
         /// note-> we can use final keyword to prevent override.
         /// Basically , you can not override methods that is final.
         // i.e. if we make area method is shape final we can not override it in the subclass circle , square etc.

         why -> method which declare final is for provide performance enhancement.
         this can also called as early binding.

         and method being resolved at runtime called late binding.

         2--------------------
         ALSO CAN BE USED TO PRESENT INHERITANCE
         if any class mark as final we can not inherit this class.

         WHENEVER YOU PUT A CLASS AS FINAL IMPLICITLY IT DECLARE ALL IT METHODS FINAL TOO.







         */
        Shape shapeObj = new Circle();



    }
}
