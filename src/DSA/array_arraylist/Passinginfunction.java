package DSA.array_arraylist;

import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        //Mutable behaviour... Arrays are mutable in java...
        // here nums reference variable and arr reference variable pointing to the same object
        //that is why original object in array being changed.


        int[] nums={3,4,5};
        System.out.println(Arrays.toString(nums));//[3, 4, 5]
        chnage(nums);
        System.out.println(Arrays.toString(nums));//[99, 4, 5]
    }

    static void chnage(int arr[]){
        arr[0]=99;
    }
}
