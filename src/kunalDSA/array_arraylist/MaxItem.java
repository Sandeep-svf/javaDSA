package kunalDSA.array_arraylist;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {3,6,88,776,4545};
        System.out.println(max_item(arr));  //find max item the array
        System.out.println(max_item_in_range(arr,0,2)); // max value in rangeofindex
        System.out.println(Arrays.toString(reverseArray(arr)));
    }


    static int[] reverseArray(int[]arr){
        int start=0,end=arr.length-1,temp=arr[0];
        while(start<end){
            Swap.swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    //work over edge cases here like array is null and all....
    private static int max_item_in_range(int[] arr,int fitstIndex,int lastIndex) {
        if(fitstIndex>lastIndex) return -1;
        if(arr.length==0) return -1;
        int maxValue = arr[0];
        for (int index = fitstIndex; index <= lastIndex; index++) {
            if(arr[index]>maxValue){
                maxValue=arr[index];
            }
        }
        return maxValue;
    }

    static int max_item(int[] arr) {
        int temp = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]>temp){
                temp=arr[index];
            }
        }
        return temp;
    }
}
