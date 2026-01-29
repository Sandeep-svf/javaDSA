package DSA.binarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            int[] arr2={9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(arr,7));
        System.out.println(orderAgnosticBS(arr2,9));
    }

    static int orderAgnosticBS(int[]arr,int target){
        int start =0, end = arr.length-1;

        // find weather the array is ascending or descending...

        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            //find middle element
            //int mid = (start+end)/2;    //int have fix size. might be possible (start+end) exceed range of int.
            // solution is
            int mid = start + (end-start) /2;

            if(arr[mid]==target) return mid;

            if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;

    }
}
