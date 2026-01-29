package DSA.recursion.part1;

public class Rec4binarysearchproblem {

    public static void main(String[] args) {
        /// working with variables in recursion vvv imp.
        //three type-> arguments, return type,body of the function

        /// example , binary search algo , start , end , mid variables

        /// argument -> (start,end) it will go in to next funcitn called.
        ///

        // steps-
        //1-> comparing weather it is left side or right side , time comp o(1)
        // 2> devide in to two half .

        ///  in binary search recurance relation will be

        ///  F(n) = o(1)+f(n/2)
        // where o(1) is content time for comparision
        // and f(n/2) is dividing array into two part in the binary search algo.

        /// notes->
        ///  types of recerence relation.
        // 1-> Linear recrance relation . e.g. fibonachy number.  ///inefficiant
        // 2-> Devide and concure recurance relation. e.g. binary search ///efficiant

        ///  2-> number and search space devided by a factor.


        ///  most important point by example fib number
        ///  f(50) many repetation funciton is being called.
        ///  even computer is getitng more time to compute this ..
        ///  so solve this problem using dynamic approach.



        /// Dynamic programming is basically means
        ///  in recursion calls two or more recursion calls are doing the same works don't comput it again and again.

        /// recursion and dynamic problem is imp in interviews.




        /// tips:



    }


   /* static int binarySearch(int[] arr, int target,int s, int e) {
        //int s = 0, e = arr.length - 1; // need to pass this two in to next future funcitn
        // only one way to do it is put inside argument.
        binarySearch(arr,target); // calling recursion funciton here.. want to devide thi array in half in sub recurion funciotn

    }*/
}
