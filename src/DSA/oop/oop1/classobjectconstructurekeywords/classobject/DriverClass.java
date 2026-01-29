package DSA.oop.oop1.classobjectconstructurekeywords.classobject;

import java.util.Arrays;

public class DriverClass {


    ///  Datatype for every single students
    public static class Students {

        // Variables inside the objects is called instance variable...
        // it should be outside tha method but inside the class...

        private String name;
        private int age;
        private int marks;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }
    }


    public static void main(String[] args) {

        Students ram;   /// Declare reference to the object...

        //// ram.age;    // Need to initialize reference variable before access instance variables.

        /// ram is a reference variable here...
         ram = new Students();
        ram.setAge(25);
        System.out.println(ram.getAge());

        ///  new keywords -> dynamically allocate memory and return reference variable to it.
        ///  in sort new keywords does dynamic memory allocation...

        /// reference variable being created in the stacks and object is being created in the heap.

        Students sam = new Students();
        sam.setAge(22);
        System.out.println(sam.getAge());

        ///  Both are pointing different memory...
        System.out.println(ram.getAge());
        System.out.println(sam.getAge());


        Students[] students = new Students[5];
        /// by default value is null here
        System.out.println(Arrays.toString(students)); /// out put -> [null, null, null, null, null]



        ///  dynamic memory allocation...
        Students aarav ;
        aarav = new Students();

        /// Students students  ( left side happend on Compile time)
        ///  new Students(); ( right side happend at runtime)

        // After compile happend and the application is running that time if any memory allocated is called
        // dynamic memory allocations.

        ///  Students(); constructor
        /// it basially dfine what happend when an object is being created.


        // by default object have
        System.out.println(aarav); /// out put -> kunalDSA.oop.oop1.classobjectconstructurekeywords.classobject.Students@5acf9800
        System.out.println(aarav.age);

    }
}








