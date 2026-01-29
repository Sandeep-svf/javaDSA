package DSA.oop.oop2.staticExample;

public class Main {



    public static void main(String[] args) {
        // if class are the same folder you do not have to import.
        Human sam = new Human(12,"sandeep maurya","Good",false);
        Human rahul = new Human(10,"Rahool maurya","Good",true);

        System.out.println(sam.name);

        /// V IMP-What is there was sort of property that is common for Human beings.
        /// e.g. population on earth are same for all human.

        /// Such  properties that are not directly related to that object. those are known as static variable/methods.

        // treating population as reference variable till now
       // System.out.println(sam.population); // 1 which is wrong two obj created so toal population is 2 for both.
       //  System.out.println(rahul.population);   // 1 which is wrong two obj created so toal population is 2 for both.

        // treating population as static variable now
        System.out.println(sam.population); // now print 2 . // accessing via reference variable here
        System.out.println(rahul.population);// now print 2  // accessing via reference variable here


        Human arpit = new Human(8,"Arpit","Good",false);
        System.out.println(arpit.population);

        /// Convention is use calss name means access via calss name...
        System.out.println(Human.population); // like this...

        /// Static variable-when a member declare as static it can be accessed before any of the object of the class
        ///  is being created and without referencing to that object.
// note - static variable are not dependent on the object.

        /// you can declare both methods and variable as statics.
        // e.g. public static void main(String args[]) .
        /// Question - why it is static - bcoz can be accessed before creating obj of the class.
        /// and main methods runs when you run java program it's an entry points.

        // so here if we not put static and to run anything inside a class we need obj of that class unit it is staic.
        // This is why main methods is static so we can access it without create an object of that class.


        // greeting(); // can not use until make it static bcoz inside static method can not use anything that is non-static.
        /// Means, A static method can only access static data. can not access non-static data.

        greeting();
    }

    // This static method is not dependent of object and mood method is dependent so can not access in this methods.
    static void fun(){

        /// mood(); // Non-static method 'mood()' cannot be referenced from a static context
        // so without specifying which instance mood() belongs to i can not use here.


        // mood(); can not use because required instance.
        // but the function you are using it in does not depend on instance.
    }


    /// But we can access static member/methods inside non-static member/methods
    static void going(){
        System.out.println("i am going to have:");
        fun(); // calling static methods here...

    }

    // we know that anything which is  non-static belong to object means can be access only after creating objects.
   static void greeting(){
        System.out.println("hello dear!");
    }
    void mood(){
        System.out.println("Great mood.");
    }



}
