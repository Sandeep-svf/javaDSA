package DSA.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //VariableLengthArgument -> when we create a methods that takes variable length of argument.
        // basically -> when we do not know how many inputs we are giving ...
        fun(1,2,3,4,5,6,7,8,9);
        stringVarArg("sam","aarav","pppooii");

        //mix of argument...
        multiple(12,34,"aarav","sam","ppii");


    }

    public static void fun(int... marks){
        // int... v    -> internally it is taking as array of integer or collection of integer...
        System.out.println(Arrays.toString(marks));
    }

    //VarArg with String...
    static void stringVarArg(String... str){
        System.out.println(Arrays.toString(str));
    }


    static void multiple(int a,int b, String... name){      // vararg must be in the last...otherwise give error
        // can;t so like -> (int a, String... name, int b) it will give error
        // also can't do like-> (int a, String... str, int... marks) it will give error too...
        System.out.println(Arrays.toString(name));
    }
}
