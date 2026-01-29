package DSA.linearSearchAlgo;

import java.util.Arrays;

public class MethodsInString {
    public static void main(String[] args) {
        String name = "aarav maurya";
        System.out.println(Arrays.toString(name.toCharArray()));    // output [a, a, r, a, v,  , m, a, u, r, y, a]
        name.length();
        System.out.println( name.toLowerCase());
        System.out.println(name);   //original one will not change.because string is immutable.
        System.out.println(name.toUpperCase());
        System.out.println(name);    //original one will not change.because string is immutable.
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("a"));
        System.out.println("    sam     ".strip());// extra space will be removed.
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
