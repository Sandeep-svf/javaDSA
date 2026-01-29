package DSA.linearSearchAlgo;

import java.util.Arrays;

public class Leetcode_Richest_Cstomer_Wealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {24,10,1},
                {2,66666,6},
                {4,2,9}
        };

        int row = find_max_wealth(arr);
        System.out.println(Arrays.toString(arr[row]));
        System.out.println(maxiumWealth(arr));
    }

    private static int maxiumWealth(int[][]arr){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum=0;
            for (int accounts = 0; accounts < arr[person].length; accounts++) {
                sum += sum+arr[person][accounts];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

    private static int find_max_wealth(int[][] arr) {

        int rwoData=0;
        int rwoData2=0;
        int max_wealth=0;
        int temp;
        for (int row = 0; row < arr.length; row++) {
            temp=0;
            for (int col = 0; col < arr[row].length; col++) {
                temp = temp+arr[row][col];
                rwoData=row;
            }
            if(max_wealth<temp){
                max_wealth=temp;
                rwoData2=rwoData;

            }
        }
        return rwoData2;
    }
}
