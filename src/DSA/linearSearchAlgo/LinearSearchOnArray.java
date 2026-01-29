package DSA.linearSearchAlgo;

public class LinearSearchOnArray {
    public static void main(String[] args) {
        int[] arr = {12,55,66,7,4,14};
        int[]arr2 = new int[0];
        System.out.println(linearSearch(arr,12));
        System.out.println(linearSearch2(arr,12));


        //Find weather 14 exist in this array or not...
        // time complexity will be 0(n)
        // o(n) in worst case where n is size of the array.
        //in best case 0(1)...if found element at index 0.
        //Time complexity -> How to time will grow as input is grow....
        // using for each enhance loop
        for(int number:arr){    //for 0 index number will be arr[0]
            if(number==14){
                System.out.println("14 exist");
                return;
            }
        }
        System.out.println("Does not exist");
    }

    //search in array.if element found return index
    // otherwise return -1

    static int linearSearch(int[] arr,int target){
        if(arr.length==0) return Integer.MAX_VALUE;
        for (int i : arr) {
            if (i == target) {
                return target;
            }
        }
       //return -1;   //what if target is -1
        return Integer.MAX_VALUE;
    }


    //search the linear search and return true and false...

    static Boolean linearSearch2(int[] arr,int target){
        if(arr.length==0) return false;
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        //return -1;   //what if target is -1
        return false;
    }


}
