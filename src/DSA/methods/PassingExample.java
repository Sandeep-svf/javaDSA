package DSA.methods;

public class PassingExample {
    public static void main(String[] args) {
        // work with primitive data type ...
        // with primitive is pass only value...

        String name = "aarav";
        greet(name);    // reference value is passing...
        // note -> java doesn't support call by reference it only support call by value.
        // only references copy pass...

        //scope of variable\
        int num = 10;   // have scope in this main method only.

    }

    private static void greet(String str) {
        // note-> str have scope in this function only. we can't access outside this function.

        System.out.println(str);    // str is reference variable which is pointing object
        // basically name and str both pointing to the same object.
        str="sam";  // here new object is being created.
        // so str is pointing new object which is sam

        //scoping
        int num = 50;   // have scope in this method only.
    }
}
