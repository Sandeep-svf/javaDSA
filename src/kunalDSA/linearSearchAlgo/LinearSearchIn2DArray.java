package kunalDSA.linearSearchAlgo;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5},
                {7,8,9}
        };

        System.out.println(find_target(arr,10));
        System.out.println(find_max(arr));
        System.out.println(find_min(arr));
    }

    //find element in 2d array
    public static int find_target(int[][]arr,int target){
        if(arr.length==0) return Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target==arr[row][col]) return target;
            }
        }
        return Integer.MAX_VALUE;
    }

    //find max value in 2d array
    public static int find_max(int[][]arr){
        if(arr.length==0) return Integer.MAX_VALUE;
        int firstElement = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>firstElement){
                    firstElement= arr[row][col];

                }
            }
        }
        return firstElement;
    }

    //find min value in 2d array
    public static int find_min(int[][]arr){
        if(arr.length==0) return Integer.MAX_VALUE;
        int firstElement = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(firstElement>arr[row][col]){
                    firstElement= arr[row][col];

                }
            }
        }
        return firstElement;
    }
}
