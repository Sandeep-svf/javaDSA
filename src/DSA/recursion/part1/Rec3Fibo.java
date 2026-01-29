package DSA.recursion.part1;

public class Rec3Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(10));;


        /// how to understand and approach problem

        // 1-> identify if you can break down into smaller problem.
        // 2-> write the recurance relation if needed. formula.
        // 3-> draw the recursin tree.
        // 4-> about the tree
        // 4.1-> see the flow of function, how they are getting in to stack.
        // 4.2-> identify and focus on left tree calls and right tree calls. fib(n-1) called than fib(n-2) called.
        // note-> until and unless left three finished called no right tree will be called see using tree.
        // 5-> draw the tree and pointer again and agian with pain and paper.
        //6-> uisng debugger to see it.
        // 7-> see how the values are returns at each steps.
        //8-> and at the ens come out of the main function.






    }
    static int fibo(int n) {
        // base condition
        /// fib(0) than return 0 if fib(1) than return 1;
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
