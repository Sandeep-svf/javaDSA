package DSA.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //Array of primitive
        int[] arr = new int[5];
        arr[0]= 23;
        arr[1]=45;
        arr[2]=85;
        arr[3]=98;
        arr[4]=65;

        //Internally it is going to store like
        //[23,45,85,98,65]
        System.out.println(arr[3]);

        //what is array is 10000 size
        // so, we can use for loop...
        /*for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

        //get directly items in array using foreach loop
        for(int num : arr){ //for every element in the array print the element...
            System.out.print(num+" ");    //here num represent element of the array....
        }

        //System.out.println(arr[5]); //Index out of bound error

        //Another way of printing
        System.out.print(Arrays.toString(arr)); //Internally it is using for loop only...


        //Array of object
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }

        System.out.print(Arrays.toString(str));

        //modify
        str[0]="aarav";
        System.out.print(Arrays.toString(str));

        //

        //2D Arrays.. Multi dimensional array





    }
}
