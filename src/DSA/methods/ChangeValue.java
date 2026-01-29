package DSA.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        chnageInArray(arr); // pass by the copy of the value by the reference
        System.out.println(Arrays.toString(arr));
    }

    private static void chnageInArray(int[] arr) {
        arr[0]=100; // modifying arrays...
        // so change will be done in original object.
    }
}
