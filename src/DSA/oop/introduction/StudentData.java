package DSA.oop.introduction;

import DSA.oop.oop1.classobjectconstructurekeywords.classobject.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentData {

    public static void main(String[] args) {

        // store 5 number
        int[] number = new int[5];
        // store 5 name
        String[] name = new String[5];

        // What if we have to store data of 5 students...
        // like name, roll number, age, address , marks etc.

        //e.g. Data of 5 students {rollNumber, name, marks}

        int[] studentNumber = new int[5];
        String[] studentName = new String[5];
        double[] studentmarks = new double[5];

        // we are storing this for single student...
        // But we want something all student data come in to single line of code like we did in student Number
        // This is where classes and object comes in to the picture.

        ///  What is class-> Name grouped of properties and function.
        ///  above is three properties is there studentNumber, name and marks ... if we combined in to single entity
        ///  we can do this using classes.
        ///  note- If we want to create our own data type we can do it using classes...
        // our own data type
        StudentDataClass studnts = new StudentDataClass(); // badically every signle element in this item contein above three properties...

        StudentDataClass aarav;

        // Real life example of classes ...
        /**
         A car can be a class...
         propertires- Engine , Seats, door

         Maruti, BMW, TATA all created their own car using these templates...
         They all have this propertires but value of properties are different ...
         e.g. engine is all there for three but can have Petrol engine , Desial Engine, and CNG Engine.


         templates (blueprint) kind of rule... not exist physically what tata and other made is exist physically.


         Same for Human calss can have grouped of properties and function like legs, eyes , head , hands etc.
         for make any human we need these stuff...  so class is sort of Rules.


         so what car tata and other makes which actually exist physically can be called as Objects.


         */


        ///  A class is templates of an objects.
        ///  A class is logical construct.
        ///  An object is intense of a class.
        ///  An object is physical reality. The things actually occupying space in the memory.


        ///  VVImp
        /**
         Object have threee essential properties...
         Note-Objects are store in the Heap memory. The reference variable store in the stack memory.
         1- State of the object. (It's value from its data type.)
         2- Identity of the object ( Weather one object is like different from the others.)
         /// Can be things like where the value store in the memory. like Stack,heap memory.
         e.g. if pointing to the same reference any change in one will be happened in the different one.
         3- behaviour of the object. ( Effect of the data type operation)
         */



        // if class have three properties name, roll number and marks how to access it in objects? ( using dot operator)
        // how to create an objects basically... ( using new keywords we were creating objects)

        ///  instance variables - Variable inside the objects is known as instance variables.



        StudentDataClass student1 = new StudentDataClass(); // student1 is object reference variable
        student1.name = "Aarav"; // so variable name is here an instance variable
        StudentDataClass student2 = new StudentDataClass();
        StudentDataClass student3 = new StudentDataClass();

        System.out.println(student1.name); // Linking of object(student1) reference variable to instance variables.



        // working with objects
        StudentDataClass sandeep; // also known as Declaring reference to the object.
        // means it only created sandeep reference variable in to the stack...
        // question-then what is it pointing to?
        // print and find out...
        // another example bcoz it will say this is not initialized
        StudentDataClass[] arrayOfStudents = new StudentDataClass[5];
        // every single element in this have type students.
        // print and find out
        System.out.println(Arrays.toString(arrayOfStudents)); // it will print null for all...
        // [null, null, null, null, null]

        ///  basically when students is not initialized by default in java it is null...
        // for primitive, it is different... ( Note that)


        // let's create object now
        sandeep = new StudentDataClass();
        /// new - Dynamically allots... Means Allocates the memory at run time and return reference to it. (VVImp)


        // e.g.

        /**

         STACK MEMORY                         HEAP MEMORY
         ┌────────────────────┐              ┌────────────────────────────┐
         │ student1           │ ───────────▶ │ StudentDataClass Object     │
         │ (reference)        │              │                              │
         │                    │              │ name       → null            │
         │                    │              │ rollNumber → 0               │
         │                    │              │ mark       → 0.0             │
         └────────────────────┘              └────────────────────────────┘

         After assigning values
         student1.name = "Sandeep";
         student1.rollNumber = 101;
         student1.mark = 85.5;

         Memory now looks like

         STACK                               HEAP
         ┌────────────────────┐              ┌────────────────────────────┐
         │ student1           │ ───────────▶ │ StudentDataClass Object     │
         │                    │              │                              │
         │                    │              │ name       → "Sandeep"       │
         │                    │              │ rollNumber → 101             │
         │                    │              │ mark       → 85.5            │
         └────────────────────┘              └────────────────────────────┘


         for another obejct student2
         (Default value will be assign.)
         for String it is a class so null
         int primitive so 0
         double primitive so 0.0


         STACK MEMORY                              HEAP MEMORY
         ┌────────────────────┐                   ┌────────────────────────────┐
         │ student1           │ ───────────────▶  │ StudentDataClass Object #1  │
         │ (reference)        │                   │                              │
         ├────────────────────┤                   │ name       → null            │
         │ student2           │                   │ rollNumber → 0               │
         │ (reference)        │                   │ mark       → 0.0             │
         └────────────────────┘                   └────────────────────────────┘
                    ↓
         ┌────────────────────────────┐
         │ StudentDataClass Object #2  │
         │                              │
         │ name       → null            │
         │ rollNumber → 0               │
         │ mark       → 0.0             │
         └────────────────────────────┘


         After assign value:
         student1.name = "Sandeep";
         student1.rollNumber = 101;
         student1.mark = 85.5;

         student2.name = "Rahul";
         student2.rollNumber = 102;
         student2.mark = 90.0;

         STACK                                  HEAP
         ┌────────────────────┐                 ┌────────────────────────────┐
         │ student1           │ ─────────────▶  │ StudentDataClass Object #1  │
         │                    │                 │ name       → "Sandeep"       │
         ├────────────────────┤                 │ rollNumber → 101             │
         │ student2           │                 │ mark       → 85.5            │
         │                    │                 └────────────────────────────┘
         └────────────────────┘
                    ↓
         ┌────────────────────────────┐
         │ StudentDataClass Object #2  │
         │ name       → "Rahul"         │
         │ rollNumber → 102             │
         │ mark       → 90.0            │
         └────────────────────────────┘



         if student2 = student1;
         Now memory becomes

         STACK                                  HEAP
         ┌────────────────────┐                 ┌────────────────────────────┐
         │ student1           │ ─────────────▶  │ StudentDataClass Object #1  │
         ├────────────────────┤                 │ name       → "Sandeep"       │
         │ student2           │ ─────────────▶  │ rollNumber → 101             │
         │                    │                 │ mark       → 85.5            │
         └────────────────────┘                 └────────────────────────────┘

         (StudentDataClass Object #2 is now eligible for Garbage Collection)


         */


        ///  HENCE-all class objets in java must allocate dynamically...  Most Important.

        StudentDataClass student4 = new StudentDataClass();
        // <- compile time------>   <-- Run time---------->
        ///  run time-Dynamic memory allocation means when program is running memory will be assigned.

        ///  Note-Accessing memory address of an object is not allowed in java which is hold by object reference variable.
        ///  For security, we can not manipulate reference of an object like we do in c in using pointer.


        // new keywords does-> Dynamically memory allocations.
        StudentDataClass student5;
        student5 = new StudentDataClass();

        // lets print student5
        System.out.println("student5 is:"+student5);
        // it gives -  student5 is:DSA.oop.introduction.StudentData$StudentDataClass@3fee733d
        // some random value

        System.out.println("roll number of student5 only initilized: " +student5.rollNumber);
        // roll number of student5 only initilized: 0 (This is Default value of int)
        System.out.println("name of student5 only initilized: " +student5.name);
        // name of student5 only initilized: null (This is Default value) of String
        System.out.println("makes of student5 only initilized: " +student5.mark);
        // makes of student5 only initilized: 0.0 (This is Default value of double)


        student5.name="Krishna Vasudevay";
        student5.rollNumber=5200;
        student5.mark=100.0;

        System.out.println("roll number of student5  after assign value to object: " +student5.rollNumber);

        System.out.println("name of student5 after assign value to object: " +student5.name);

        System.out.println("makes of student5 after assign value to object: " +student5.mark);






        // System.out.println(sandeep.name); // error - Variable 'sandeep' might not have been initialized
        sandeep = new StudentDataClass(); // now object is created... means initialized object to reference variable.
        System.out.println(sandeep.name); // it will work fine now. but give value null.




        ///  STEP-2
        // we are assigning value to instance variable after initializing object which is repetitive.
        // can we do it while initializing object what question is arriving now?

        // answer is YES WE can do... This  is where Constructor comes in to the picture.

        /// Constructor- It defines what happens when object is being created.
        /// It is special type of function in the class that runs when oyou create an object,it allocates some variables.
        ///  if there is no special function (Constructor) in the class by default empty constructor will be created.

        ///  Most imp-
        ///  Constructor does not create memory — new creates memory, constructor initializes it.

        StudentConstructor ram = new StudentConstructor("aarav maurya",1234,100.0);
        ///  ("aarav maurya",1234,100.0); -> Bind these arguments with the objects.


        /**

         STACK MEMORY
         ram
         ↓
         HEAP MEMORY
         ┌──────────────────────────────┐
         │ StudentConstructor Object    │
         │                              │
         │ name       → "aarav maurya"   │
         │ rollNumber → 1234            │
         │ mark       → 100.0            │
         └──────────────────────────────┘


         Important detail (Strings!)

         The string "aarav maurya" is also an object

         STACK MEMORY
         ram
         ↓


         HEAP MEMORY
         ┌──────────────────────────────┐
         │ StudentConstructor Object    │
         │ name ───────────────┐        │
         │ rollNumber → 1234   │        │
         │ mark       → 100.0  │        │
         └─────────────────────┘        │
           -----------------------------'
           ↓
         ┌──────────────────────┐
         │ String Object         │
         │ "aarav maurya"        │
         └──────────────────────┘


         */

        StudentConstructorDefaultValueSet object1 = new StudentConstructorDefaultValueSet();
        System.out.println(object1.name); // here in the constructor only we have set value
        // means while initialized object default value will be set to all members,

        ///  calling empty constructor
        StudentConstructor random = new StudentConstructor();


        StudentConstructor ram2 = new StudentConstructor("aarav maurya",1234,100.0);
        ///  passing obj in constructor
        StudentConstructor random2 = new StudentConstructor(ram2);

        System.out.println(random2.name); // it will print ram2.name



         ///  note-java can have as many constructor you want in a particular class with different - different parameters.
         ///  basically this keyword was replacing reference variable of object.
         ///  it will replace with the current obj you call it.


        ///  now one-step dipper - we can call constructor form another constructor as well.
        StudentConstructor random3 = new StudentConstructor();

        System.out.println(random3.name); // aarav maurya default name.

    }






    static  class StudentDataClass{
        String name; // this is instance variables ( Outside the methods but inside the class)
        int rollNumber;
        double mark;
    }

    static class StudentConstructorDefaultValueSet {
        int rollNumber;
        String name;
        double marks;

        StudentConstructorDefaultValueSet() {
            this.name="value set to aarav";
            this.rollNumber=1234;
            this.marks=100.0;
        }

        void greeting(){
            System.out.println("Hello! My name is"+name);
        }

    }

    static class StudentConstructor{

        String name;
        int rollNumber;
        double mark;

        // Constructor
        // Now while create object user have to define all value of this instance variable.
        // Constructor name will be the same as class name
        /// It is special type of function in the class
        public StudentConstructor(String name, int rollNumber, double mark) {
            this.name = name;  // here this.name is basically objectName.roll this is reference object.
            // menas if my obj is aarav then this.name replace with aarav.name here.

            this.rollNumber = rollNumber;
            this.mark = mark;

            ///  if this.name and arguments variable is same name
            ///  e.g. this.name = name
            ///  then this is imp to which variable to what?
            ///
        }

        ///  we need a way to add the value of above properties object by object.
        /// so will use here this keyword with dot operator here.
        /// means when it will create object ram that means this(keywords) will be replaced by ram(reference variable) of the object. ///MOST IMP

        ///  we can also assign default value to out constructor means if anyone create obj what value by default will be
        /// print...



        // empty constructo
        public  StudentConstructor (){
            /*this.name="default name arrav";
            this.mark= 0.0;
            this.rollNumber=0;*/

            // This is how you call constructor form another constructor. using this keywords
            // by default call this constructor StudentConstructor(String name, int rollNumber, double mark)
            this("aarav maurya",2323,232.89);

            ///  here this will be replaced name of a class/constructor
            ///  internally it will like StudentConstructor("aarav maurya",2323,232.89);


        }

        ///  Constructor takes object as parameter...
        StudentConstructor( StudentConstructor other){
            ///  here other will be replaced with ram2 and this will be replaced with random2.
            ///  form where we are calling ...

            /// e.g. ramdom2.name = ram2.name (This will happen behind the seen.)

            this.name = other.name;
            this.mark = other.mark;
            this.rollNumber = other.rollNumber;
        }




    }


}
