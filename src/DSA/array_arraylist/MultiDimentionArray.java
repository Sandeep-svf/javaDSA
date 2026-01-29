package DSA.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        //something like Matrix
        //no of colum is not necessary to specify
        // no of rows is mandatory
        //int[][] arr = new int[3][];

        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // in c++ it is contiguous memory allocation
        // in java
        // in heap we can imagine it is as an array of arrays-> 0 indexes are an array itself same 1 index is an array itself
        // add so on...

        // printing multi dimantional array
        System.out.println(arr[1]); //it will print some reference like [I@56cbfb6 because it is an array  itself
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);


        //Individual size of array can vary as well
        //so, it is not necessary to specify coloum in multi dimantional array
        int [][] arr2 = {
                {1,2,3},    //0 index
                {4,5},      //1 index
                {6,7,8,9}   //2 index -> arr2[2][0] = 6
        };
        System.out.println(Arrays.toString(arr2));

        //input
        // arr[row].length -> every array at the row a length of that array...
        int [][] matix = new int[3][3];
        System.out.println(matix.length);   // it will give no of row

        Scanner in = new Scanner(System.in);

        //
        for (int rwo = 0; rwo < matix.length; rwo++) {
            // for each col in every row
            for (int coloum = 0; coloum < matix[rwo].length; coloum++) {
                matix[rwo][coloum]=in.nextInt();
            }
        }

        //print 2d array
        for (int row = 0; row < matix.length; row++) {
            for (int col = 0; col < matix[row].length; col++) {
                System.out.print(matix[row][col]+" ");
            }
            System.out.println();
        }

        //print another way
        for (int row = 0; row < matix.length; row++) {
            System.out.println(Arrays.toString(matix[row]));
        }

        //another way of printing...
        for(int[] item: matix){
            System.out.println(Arrays.toString(item));
        }

    }
}
