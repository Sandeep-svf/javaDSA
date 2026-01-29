package DSA.linearSearchAlgo;

public class LinearSearchInRange {

    public static void main(String[] args) {
        int[] arr={20,4,5,7,8,5,30,5,900};
        System.out.println(linearSearch(arr,20,0,4));
        System.out.println(find_min(arr));
        System.out.println(find_max(arr));
    }

    //find max number in an array using linear search.
    public static int find_max(int[] arr){
        if(arr.length==0) return Integer.MAX_VALUE;
        int fitsrtElement = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]>fitsrtElement){
                fitsrtElement=arr[index];
            }
        }
        return fitsrtElement;
    }


    //find min number in an array using linear search...
    static int find_min(int[] arr){
        if(arr.length==0) return Integer.MAX_VALUE;
        int fitsrtElement = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]<fitsrtElement){
                fitsrtElement=arr[index];
            }
        }
        return fitsrtElement;
    }


    static int linearSearch(int[] arr, int target, int start,int end){
        if(arr.length==0) return Integer.MAX_VALUE;

        //run for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element==target) return index;
        }
        return Integer.MAX_VALUE;
    }
}
