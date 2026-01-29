package DSA.string_stringbuilder;

import java.util.Arrays;

public class StringOutput {
    public static void main(String[] args) {

        //all println calling different method based on types
        // println is a function in out variable of type PrintStream

        //note-> println is calling toString method.
        // println call value of which call toString method.

        System.out.println(1);  //println(int x)
        System.out.println("abc");  // println(String x)
        System.out.println(true);   // println(boolean x)
        System.out.println(45.00);  //println(double x)
        System.out.println(new int[]{1,2,3,4,5});   // println(Object x)


        // use toStirng methods available in the Arrays
        // this one is calling toStirng method from Arrays class. it also called method overriding.
        System.out.println(Arrays.toString(new int[]{6,7,8}));
        
        String name = null;
        System.out.println(name);

        //putting in wrapper class
        /*Integer num= new Integer(89);
        num.toString();
        num.equals(89);*/
    }
}
