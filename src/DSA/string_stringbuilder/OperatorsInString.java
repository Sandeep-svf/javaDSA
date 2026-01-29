package DSA.string_stringbuilder;

import java.util.ArrayList;

public class OperatorsInString {
    public static void main(String[] args) {


        System.out.println('a'+'b');    //it will assccai value of char
        System.out.println("a"+"b");    //concatenation of String.  here it will create new obj "ab" form "a"+"b".
        System.out.println('a'+3);  // asccai value 'd' which is 100
        System.out.println((char) ('a'+3));   // convert asccai value 100 in to char

        System.out.println("a"+3);  //this is same as "a"+"1"
        //integer will be converted to Integer that will call toStirng() method.


        //complex data
        System.out.println("aarav"+new ArrayList<>()); //new ArrayList<>() this is obj so will call toStirng method

        //Note-> operator + in java is only defined for primitive or any on of the value is String.





    }
}
