package DSA.binarySearchAlgo.InterviewQuestion;

public class CellingOfNumberProblem {
    public static void main(String[] args) {
        //ceiling no = smallest no in the array grater or equal to then target element
        // target is 13 so ceiling no is 13
        // target is 15 so ceiling is 17
        int[] arr = {1,5,9,13,17,20,25,90};
        System.out.println(findCeilingnumber(arr,8));
    }

    private static int findCeilingnumber(int[]arr,int target){
        int start=0,end=arr.length-1;
        int mid = 0;
        while(start<=end){

            mid = start+(end-start)/2;
            
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]==target){
                return arr[mid];
            }
        }
        if(arr[mid]<target){
            return arr[mid+1];
        }else{
            return arr[mid];
        }
    }
}
