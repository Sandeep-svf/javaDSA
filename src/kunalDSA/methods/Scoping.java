package kunalDSA.methods;

public class Scoping {
    //global scope
    public static void main(String[] args) {
        //Scoping...
        //function scoping...
        int a = 10;
        int b = 20;
        System.out.println(a);

        //same for string
        String name = "aarav";

        // block scoping...

        {
           // int a = 90; // can't initialize the same variable again
            a = 90; // can change the value...
            int marks = 78;
            int c = 99;
            // value initialized in this block will remain in this block.

            name="sam";
        }
        System.out.println(a);  // will print 90 because change made in block scope...
        //System.out.println(c);  // c have block scope only so can't print outside the block.
        System.out.println(name);

        //scoping in for loop
        for (int index = 0; index < 5; index++) {
            // can't access i outside the for loop...

            // block variable change done after one time loop run...
            {
               index=90;
            }
            System.out.println("hhh");

        }
    }

    static void printValue(int marks){
        System.out.println(marks);

        int c = 900;
        System.out.println(c);
    }
}
