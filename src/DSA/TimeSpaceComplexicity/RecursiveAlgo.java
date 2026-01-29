package DSA.TimeSpaceComplexicity;

public class RecursiveAlgo {

    /***
     Fibonacci tree for f(4)

     f(4)
     ├── f(3)
     │   ├── f(2)
     │   │   ├── f(1) = 1
     │   │   └── f(0) = 0
     │   └── f(1) = 1
     └── f(2)
          ├── f(1) = 1
          └── f(0) = 0


     Evaluation flow

     f(2) = 1 + 0 = 1
     f(3) = 1 + 1 = 2
     f(4) = 2 + 1 = 3

     Final result
     f(4) = 3


     Recursive call tree:

                ① f(4)
             /           \
        ② f(3)          ⑨ f(2)
        /      \           /     \
     ③ f(2)   ⑦ f(1)   ⑩ f(1) ⑪ f(0)
     /     \
     ④ f(1)   ⑤ f(0)


     TC of Recursive Algo :
     SC of Recursive Algo :

     note: Function calls are stores in the stacks. Means It takes memory in the stack.

     Most Imp :
     1-> At any particular point of time no two function calls at the same levels of recursion will be in the stack at same time.
        trick: Only calls that interlinked will be in the stack at the same time.( previous one will be waiting for next one to execute
        and next one to next one like this way, this is how they are interlinked)

     for example:  in below tree structure  if 9 is calling for execute means, 2,3,4,5,7 of left side already executed.
     And this is not linked with f(2) right side.

            ① f(4)
           /           \
     ② f(3)          ⑨ f(2)
        /   \           /     \
     ③ f(2)  ⑦ f(1)⑩ f(1) ⑪ f(0)
     /     \
     ④ f(1) ⑤ f(0)

     interlinked means: while calling number 5 which is f(0) in left side.. that menas in the stack will be 1,2,3,and 5 at the same time
     because these ares interlinked. And it followed tree traversal rule means should be in direction can not link anything with any.


                   ① f(4)
                /           \
             ② f(3)     ⑨ f(2)
              /   \           /     \
          ③ f(2)  ⑦ f(1)⑩ f(1) ⑪ f(0)
        /     \
     ④ f(1) ⑤ f(0)

     e.g.

     Recursion Tree (Complete & Level-Correct):

     Level 0:                    f(4)
                                /    \
     Level 1:               f(3)      f(2)
                            /   \      /   \
     Level 2:            f(2)  f(1)  f(1)  f(0)
                            / \
     Level 3:          f(1) f(0)

     Call Stack at Deepest Point (Execution):

     | f(1) |   ← Level 3
     | f(2) |   ← Level 2
     | f(3) |   ← Level 1
     | f(4) |   ← Level 0

     So , for all these... what is the maximum spce we are taking here ... meanas, the longest chain here will be the answer.
     So, SC = The height of the tree.

     based on this for n=4 we have 4 longest chain ... form tree structure given below...
     so Space Complexity + Axillary space is O(n) in this case.

                    ① f(4)
                 /           \
             ② f(3)     ⑨ f(2)
              /   \           /     \
     ③ f(2)  ⑦ f(1)⑩ f(1) ⑪ f(0)
     /     \
     ④ f(1) ⑤ f(0)


     Recursive Algo Space Complexity is == Height of the tree.
     for Fibonacci nuber when we calculate then it comes = O(n).

     */


    // how to solve recursion problem
    // There is two type of recursion problem.

    

}
