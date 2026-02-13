package DSA.oop.oop2.staticExample;

// static public class InnerClasses {  - it can not be static if it has inner class. same reason cannot access non-static stuff.
 public class InnerClasses { // Outside class

    // Outside classes can not be static- bcoz it not dependent itself on another class.

    static class Test{ // inner class ( static here means it will not depend for an obj on innerclasss )

          String name;  // if create this static then it will have only one instance and can not depend on obj.

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

         ///  here, test is dependent on another class.
        ///  so, for use it here we need to make this class static.
        ///  if it is not dependent on any other calss then no need ot make ti static bcoz not dependent on any other class
        ///  for an object.
        Test obj = new Test("Sam");
        Test obj1 = new Test("Rahool");

        System.out.println(obj.name);
        System.out.println(obj1.name);


        /// Note- obj is being resolved during runtime.. but static stuff during compline time.

    }


}

