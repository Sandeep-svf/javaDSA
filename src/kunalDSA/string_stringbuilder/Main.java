package kunalDSA.string_stringbuilder;

public class Main {
    public static void main(String[] args) {
        // primitive store in stack memory...
        // string -> collection of characters...
        // String is the most usable class in java... class of java...
        // string -> object of type string
        // string (datatype) str (reference variable,stack memory) = "ram" (object,heap memory)
        String str = "ram";
        System.out.println(str);

        //question-> will it point to the same object or different.
        //concepts 1-> String pool (separate memory structure inside the heap.)
        //concepts 2-> Immutability(can't modify the object... can't change)
        //note-> all similar value not being recreated in the pool.
        //answer-> it will create same object.

        //question-> then what if change made in reference variable a... so will b also be change???
        // reason -> immutability...
        String a = "aarav";
        String b = "aarav";
        b = b+"sam";    //create new object here
        System.out.println(a);
        System.out.println(b);


        //creating a new object example
        String name = "krishna";    // name point object krishna
        System.out.println(name);
        name = "radha"; // now name pointing object radha
        System.out.println(name);

        //note-> krishna object going to handle by garbage collector...

        //question-> why we can't modify object of string
        //ans-> due to immutability and security reason.
        //reason-> if 5 reference variable pointing to the same object and one ref variable can change it then
        // for all rest ref variable point to the changed object which is not possible in java...due to
        // string immutability










    }
}
