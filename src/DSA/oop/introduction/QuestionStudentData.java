package DSA.oop.introduction;

import javax.swing.*;

public class QuestionStudentData {

    /// Question1-  why we do not have new keyword while create primitive data like we do have in object creation ?
    // In java primitive data type not implemented as object.
    // In java primitive are not object hence they are store in stack memory only.
    // note-object store in heap memory that we know.

    ///  note- but in python if we write a = 10 here 10 is object.
    ///  Means there is no primitive in python.

    ///  why java have primitive then what is use of it...
    // for efficiency fo make it fast because making it to heap memory make it slower.

    /**
     The Performance Factor (Memory & Speed)
     Primitives like int, double, and boolean are stored directly on the Stack. Objects, on the other hand,
     live on the Heap.

     Stack (Primitives): Accessing the stack is incredibly fast. A primitive int takes up exactly 32 bits (4 bytes)
     of memory.

     Heap (Objects): An Integer object is much "heavier." It requires metadata (an object header), a reference pointer,
     and the actual value. This can take up 128 bits or more—nearly 4 times the memory of a primitive!

     The "Short" Answer: Using primitives in heavy loops or math-heavy applications saves massive amounts of memory
     and prevents the CPU from doing extra work (like pointer dereferencing).

     */


    ///  Question 2-
    ///  Runtime memory allocation using new keywords in java...

    // When you use the new keyword in Java, you are performing Dynamic Memory Allocation.
    // This means memory is set aside for an object while the program is running, rather than at compile time.
    //In Java, this process involves a "handshake" between two different parts of memory: the Stack and the Heap.


    /**
     What happens during new MyClass()?
     When the JVM (Java Virtual Machine) encounters the new keyword, it performs these four steps:

     Memory Allocation: It calculates how much memory the object needs (based on its variables) and finds a free gap
     in the Heap.

     Initialization: It fills that memory with default values (e.g., 0 for ints, null for objects).

     Constructor Execution: It runs the constructor code to set the initial state of the object.

     Reference Assignment: It returns the memory address of that Heap location and stores it in a variable on the Stack.
     */


    ///  also what if our two reference variable pointing to the same object...


    public static void main(String[] args) {
        Phone samsungA2 = new Phone();
        samsungA2.name= "Samsunag Galaxy Series.";
        Phone samsungA5 = samsungA2;
        System.out.println(samsungA5.name);  // here samsungA5  name is also Samsunag Galaxy Series.
        ///  because reference variable pointing to the same object any change done in one happen on other as well.
    }

    //




    static class Phone{
        String name;

    }


}

