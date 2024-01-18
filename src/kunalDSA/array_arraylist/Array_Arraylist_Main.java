package kunalDSA.array_arraylist;

import java.util.Arrays;

public class Array_Arraylist_Main {
    public static void main(String[] args) {
        //Store roll number
        int rollNumber = 45;
        //Store a person name
        String personName = "Aarav";

        //store five roll number
        //we can use array for this-> Collection of data type weather it is primitive, object etc.
        // datatype -> it define what kind of data storing in the array...
        //all the type of data in the array will be same...
        //[] -> rollNumbers(reference variable) is pointing to an array object that contains type integers elements
        // right side is object and left side variable is reference variable
        //Syntax
        // datatype[] variableName = new datatype[size]
        int[] rollNumbers = new int[5];
        //or directory
        int[] rollNumbers2 = {10,11,12,14,45};

        // break down code
        int[] rollNumbers3;  //Declaration of the array. rollNumbers3 is getting in the (stack) (Compile time)
        rollNumbers3 = new int[5];  // Initialization, Actually ,here object is getting created in the memory(heap memory).
        // (Run Time) also name as Dynamic memory allocation->At the run time memory will be allocated.

        //Continuous-> in c it store in continuous ... all memory allocated together
        // string object of array is totally depends on weather it is going to be continuous or not.
        // because -> array object are in heap...and heap object are not continuous in java....and
        // dynamic memory allocation. So "array object in java may not be continuous".


        //new keyword-> use for create an object
        // if we don't use new keyword... then still java internally doing the same things.
        // int[] rollNumbers2 = {10,11,12,14,45};

        //indexes of array
        // index-> start from zero.
        System.out.println(rollNumbers2[0]);
        System.out.println(rollNumbers2[1]);

        rollNumbers2[0]=99;
        System.out.println(rollNumbers2[0]);

        //by default, it's going to have 0 value
        System.out.println(rollNumbers3[0]);
        System.out.println(Arrays.toString(rollNumbers3));

        System.out.println(Arrays.toString(rollNumbers2));

        //in stirng datatype it will print null by default
        String[] peopleName = new String[5];
        System.out.println(peopleName[0]);
        System.out.println(Arrays.toString(peopleName));

        //null can be assigned to primitive only ... we can not assign it to non-primitive as given below
        // null is not datatype or object. it is special kind of value of literal which can be case to any type.
        // it is the default value what reference variable point to.
        String str = null;
        //int roll = null; it will throw error


        //primitive -> something that can not be broken down... like int ,double ,float etc.
        // non-primitive -> something that can be broken down... like string can be broken down in to character
        // array object can ob broken down in to individual address...



        String[] address = new String[5];
        // how internally  works...
        //all primitive type store in stack and all object store in heap...in java.
        //String[] address -> address is reference variable here which is going to store in stack...
        // new String[5] -> each particular element itself is an object.
        // and this entire each object store in different parts of the memory.

        /*
        Note-> MOST IMPORTANT -> ARRAY IS COLLECTION OF REFERENCE VARIABLE AND EACH REFERENCE VARIABLE IS POINTING
        TO THE OBJECT.....BY DEFAULT IT IS NULL FOR NON-PRIMITIVE
        */


























    }
}
