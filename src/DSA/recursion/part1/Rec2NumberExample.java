package DSA.recursion.part1;

public class Rec2NumberExample {

    public static void main(String[] args) {
        // write a function that takes in a number and print it.
        // print first 5 numbers: 1 2 3 4 5

        /**. Recursion
         * function calling another function
         * problem -> one thing is common -> the body and definition of function is same.
         * then why create it again and again
         * a solution is -> call the function itself.
         *
         * tail recursion -> last function being called name is tail recurion.
          */

        ///  base condition in recursion
        ///  it is a conditin where our recusrin stop making new calls.

        ///  note-> if you are calling a fun again and again, you can treat it as a separate call in the stack.
        ///  means all funciton it stack will take saparate momoey along it's funciton.
        ///  e.g. print1 will take saparate memory in the stack same print 2 will take and so on.


        ///  if no base condition -> infinite calls.->
        /// ->function call will happening , ->every call of function will take memory ->
        /// -> one time will comes where momory of computer will exceed and give stack overflow error.

        // note-> primitive also store in the stack memory.

        ///  imp -> All the funciton call happened, they go in to the stack memory. FILO
        ///  how function call works in languages
        // 1-> while the funciton is not finish executing, it will remain in the stack.
        ///  in the stack main() call the print1() call so they both in the stack.
        ///  print1 is not yet then it called print2 so print 2 is inthe stack
        ///  print2 is not done yet it called print3 so print 3 called and come inside the stack memory.
        ///  print3 is not done yet it is calling print4 so print4 is come inside in the stack memory.
        ///  print4 is not done yet it is calling print5 so print5 come inside the stack memory.
        ///  now print5 is not calling any other function.
        ///  stack order is -> main()->print1->print2->print3->print4->print5


        ///  When a funciton finished it executing it is removed from the stack and flow of program is
        ///  restore where it funciton called.

        /// print5 function finished than return to print4 and print5 is removed from stacks.
        /// print4 function finished than return to print3 and print4 is removed from stacks.
        /// print3 function finished than return to print2 and print3 is removed from stacks.
        /// print2 function finished than return to print1 and print2 is removed from stacks.
        /// print1 function finished so it removed from stack too and return to main and main also removed form stacked and program overed.


        /// most imp-> while funciotn call is not finished it executing it will stay in the stack memory.




        //2->




       // printNumber(1);

        // instance of printing another funciton there is a better way

        printNumberSolution(1);



        /// why recursion ->
        // It helps us in solving bigger complex problem in a simple way.
        // e.g. -> problem releted to dynamic programming etc.
        // you can convert recursion solutions in to iteration(loop) and vice versa.\
        // means first solved it using recursion than convert it in to iteration(loops) to get an optimized answer.
        // because directly soloving it in to iteration is difficult that's why use recursion.

        ///  space complexity is not constant because of recursive calls.



        /// v v imp->
        /// visualising recursion
        /// main-> print1->print2->print3->print4->print5
        /// print5 return print4
        /// print4 return to print3
        /// print3 return to print2
        ///  so on ot print 1 and main

        /// this is called recursive tree.


        /// recursion tree

        /// question -> find nth fabonachi number (number of sum of previous two number..)
        /// 0,1,1,2,3,5,8,13

        // to know if any problem can be solve using recursion try to find out
        // if you can break it down in to smaller problem...

        /// most imp -> fib(n) will be fin(n-1)+fib(n-2). // this is known as recurance relation.
        ///  sum of previous two fib number.

        ///  now above probem is devided in to two samller probem-> so here we can apply recursion.
        ///  so on -> fib(n-1) = fib(n-2)+fib(n-3) ... like that so on...


        /// better make a tree here...
        // fib (5) = fib(4)+fib(3)
        // fib(4) = fib(3)+fib(2)
        // fib(3)....

        // step->
        /// break it down in to a smaller problem.
        /// the base condition is represented by the answer we have. fib(0)=0 and fib(1)=1 this is base condition.


    }

    static void printNumberSolution(int n) {
        if(n == 5) {
            System.out.println("Printing number: " +n);
            return;
        }
        System.out.println("Printing number: " + n);
        printNumberSolution(n+1);
    }

    static void printNumber(int n) {
        System.out.println(n);
        printNumber2(2);
    }

    static void printNumber2(int n) {
        System.out.println(n);
        printNumber3(3);
    }

    static void printNumber3(int n) {
        System.out.println(n);
        printNumber4(4);
    }

    static void printNumber4(int n) {
        System.out.println(n);
        printNumber5(5);
    }


    // functionn body here chnaged only print is called.
    /// imp -> this is called tail recursion
    /// this is the last funcitn being called here.
    static void printNumber5(int n) {
        System.out.println(n);
    }
}
