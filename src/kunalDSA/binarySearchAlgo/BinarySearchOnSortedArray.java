package kunalDSA.binarySearchAlgo;

public class BinarySearchOnSortedArray {

    public static void main(String[] args) {

        //Binary Search (Is work with sorted array only...)
        // Time Complexity (best case) -> O(1)
        // Time Complexity (worst case) -> O(log n) at every level no of element is n/2
        // so, we can write it n/2 power k where n is no of element and k in total level...
        //so finally... it will be 1= (n / 2 power k) take log both side solve.so we will get
        // k = log(n)


        //comparison with linear search and  binary
        //  In linear with 1 million element it will take 1 million comparison
        // In binary with 1 million element it will take something near to 20 comparison


        //sorted array in ascending order....
        int[] arr = new int[]{2,4,6,8,14,18,30,36,50};
        System.out.println(binary_search_asceding_order(arr,4));

        //sorted array in descending order...
        int[] arr2 = {90,75,46,38,7,3,1};
        System.out.println(binary_search_decending_order(arr2));

        //Case -> how to know our array is descending or ascending order...
        // always pick first index element and last index element and compare it.
        // {3,3,3,,3,3,3,,3,3,67}
        //{55,34,20,22,2,2,2}

    }

    private static int binary_search_decending_order(int[] arr2) {
        return -1;
    }

    //return the index.
    //return -1 if it does not exist.
    public static int binary_search_asceding_order(int[]arr,int target){
        int start =0, end = arr.length-1;

        while (start<=end){
            //find middle element
            //int mid = (start+end)/2;    //int have fix size. might be possible (start+end) exceed range of int.
            // solution is
            int mid = start + (end-start) /2;

           if(target<arr[mid]){
               end =mid-1;
           }else if(target>arr[mid]){
               start=mid+1;
           }else{
               //answer found
               return mid;
           }        

        }
        return -1;
    }
}
