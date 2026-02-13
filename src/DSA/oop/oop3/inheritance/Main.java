package DSA.oop.oop3.inheritance;

public class Main {
    /*

    Base Class (Parent/Super Class): The existing class that serves as the template.
    It contains common attributes (data) and methods (actions) that are shared across different objects.


    Child Class (Derived/Sub Class): The new class that "extends" the base class.
    It automatically gets everything from the base class but can Override existing methods or Add new ones.

      ┌──────────────────────────┐
      │       BASE CLASS         │ ◄── (General)
      │    "Vehicle"             │
      ├──────────────────────────┤
      │ - Speed                  │
      │ - Fuel                   │
      ├──────────────────────────┤
      │ + Move()                 │
      └─────────────┬────────────┘
                    │
           [ INHERITS FROM ]
                    │
      ┌─────────────▼────────────┐
      │      CHILD CLASS         │ ◄── (Specific)
      │    "Electric Car"        │
      ├──────────────────────────┤
      │ - BatteryLevel           │ <── (New Property)
      ├──────────────────────────┤
      │ + Move() [Overridden]    │ <── (Modified Action)
      │ + Charge()               │ <── (New Action)
      └──────────────────────────┘

    */

    /// Child class inheriting the properties from base class. this is known as Inheritance.
    ///  It inherits using extend keywords.

    /// whenever call constructor of child class we have to initialized parent class variables as well.


    public static void main(String[] args) {
       // Box box = new Box();
       /* Box box = new Box(1,5,7);
        Box box1 = new Box(box);
        System.out.println(box.length+" "+box.height+" "+box.width);*/
        ///  can not access child class stuff form it's parent class.


        ///  most imp and beautiful things in inheritance
        // box2.weight (Can not access child class from parent class even tho it is object type child class
        // reference type is parent class in stack but in heap object type is child class.

        /// It actually types of the variable not type of the object is determining what member can be assessed.
        /// here BoxWeight object is initialized.
        Box box2 = new BoxWeight(1,2,3,4);

        // let's assume this senario     BoxWeight boxWeight = Box(1,2,3);

        /// There are many variables in both parent and child classes .
        /// you are given access to variable that are in reference type.
        /// hence, here you should access to variable weight.
        /// This also menas that, the one you are trying to access is also shuld be initialized.
        /// but here, the object itself a type of parent class... how will you call the constructor of child class.
        ///  this why here is error and not allowed.
        // BoxWeight boxWeight = Box(1,2,3);


        // Let's talk about super keywords
        // 1- Box class constructor use..
        /// It is pointing to it above class .. like this parent class point to Object Class
        /// and BoxWeight class pointing to the above class of it which is Box class.

        // 2- BoxWeight constructor use
        /// if parent and child class have same variable name shape. then access shpe variabel forn child class of
        /// super class we need keyword super i.e. super.shape (from child class it access parent class.)






        // box weight
        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.length+" "+boxWeight.weight); // output = -1.0 -1.0




        /// Types of inheritance:

        //1->  Single inheritance-> Once class extends another class.
        // i.e. BoxWeight was inheriting Box class.

        /*
        2-> Multi-level Inheritance  -
        Multilevel Inheritance is a mechanism where a class extends a derived class, thereby inheriting the properties
        and methods of all its ancestor classes. In Java, this is achieved using the extends keyword in a
        sequential manner.

      ┌──────────────────────────┐
      │      CLASS A (Base)      │  <── Grandparent
      │      [Properties]        │
      ├──────────────────────────┤
      │      [Methods]           │
      └──────────┬───────────────┘
                 ▼
      ┌──────────────────────────┐
      │     CLASS B (Derived)    │  <── Parent (Inherits A)
      │      [Adds New]          │
      ├──────────────────────────┤
      │      [Overrides A]       │
      └──────────┬───────────────┘
                 ▼
      ┌──────────────────────────┐
      │     CLASS C (Derived)    │  <── Child (Inherits B & A)
      │      [Specific]          │
      └──────────────────────────┘

        i.e. Box->BoxWeight->BoxPrice
        here BoxWeight inherit Box class and BoxPrice inherit boxWeight class.

        */

        /*
        3-> multiple Inheritance-> One class is extending more than one class.

      ┌──────────────┐         ┌──────────────┐
      │  n = 10 .    │         │  n = 5 .     │
      │  "Printable" │         │ "Scannable"  │
      └──────┬───────┘         └──────┬───────┘
             │                        │
             └───────────┬────────────┘
                         │
              ┌──────────▼───────────┐
              │       CLASS          │
              │   "AllInOnePrinter"  │
              └──────────────────────┘
        (Inherits behavior from BOTH interfaces)


        if both have same variable n adn call form class AllInOnePrinter then which n it will call that is why
        Multiple inheritance is not supported by java.

        To achieve this in java we have Interfaces.

        */


        /*

        4-> Hierarchical Inheritance - One class is inherited by more than one classes.

        Hierarchical Inheritance is a type of inheritance where two or more classes are derived from a single
        common superclass. This allows multiple child classes to share the common features of the parent while
        maintaining their own unique specialized behaviors.


              ┌──────────────────────────┐
              │      BASE CLASS (A)      │
              │         "Account"        │
              └─────────────┬────────────┘
                            │
            ┌───────────────┼───────────────┐
            │               │               │
    ┌───────▼───────┐  ┌─────▼───────┐   ┌─────▼───────┐
    │ CHILD CLASS B │ │ CHILD CLASS C │ │ CHILD CLASS D │
    │ "SavingsAcc"  │ │ "CurrentAcc"  │ │ "SalaryAcc"   │
    └───────────────┘ └───────────────┘ └───────────────┘




        */

        /*
        5-> Hybrid Inheritance-> It is combination of Single and Multiple Inheritance.

       Because, in java we do not have Multiple inheritance hence we do not have Hybrid inheritance.
       // we can achieve this functionality using Interfaces.

        */




        // static methods

        Box boxStaticExample = new Box();
        boxStaticExample.greeting();   // not dependent the object of the class...
        /// but can access using class name as well. bcoz not dependent an object.

        /// problem-> Can we override static methods.
        /// No we can not override static member in inheritance in child class.

        /// THERE IS NO POINT IN OVERRIDING THEM IN THE CHILD CLASS BECAUSE THE METHOD IN THE PARENT CLASS
        /// WILL ALWAYS RUN NO MATTER FROM WHICH OBJECT YOU CALL IT.

        /***

         OVERRIDING DEPENDS ON OBJECT
         STATIC DOES NOT DEPENDS ON OBJECT
         HENCE, STATIC METHOD CAN NOT BE OVERRIDE.

         /// you can inherit but you can not override static methods.
         */






    }
}
