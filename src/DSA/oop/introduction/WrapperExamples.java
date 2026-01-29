package DSA.oop.introduction;

public class WrapperExamples {

    public static void main(String[] args) {
        int a = 10;
        // Integer num = new Integer(45); // can be assign using wrapper calsses as well int value.
        Integer number = 45; /// imp-Now it is created as an object.


        /// question - swap primitive to wrapper
        swap(a, number);
        System.out.println(a + " " + number);  // it will not swap
        ///  not swap bcoz - a i spremitive and in java
        /**
         1. Pass-by-Value (The Main Reason)  // java is pass by value not reference.
         Java always passes a copy of the data.
         When you pass a (primitive), you pass a copy of the number 10.
         When you pass number (object), you pass a copy of the address pointing to 45.
         Inside the swap method, you are only swapping the copies inside that local scope.
         The original variables outside the method never change.

         2. Immutability (The Wrapper Trap)
         Wrapper classes like Integer are immutable. You cannot change the value inside an Integer object once it is created.
         Even if you tried to change b, Java would just create a brand-new Integer object and point the local variable to it,
         leaving the original 45 untouched on the Heap.
         */

        // inside Integer calss it is public final class Integer extends Number
        // means using final ..

        final int b = 23;
        /// b = 45; // can not modify final variable.

        final int age;
        /// Yes, a final variable must be initialized before it is used.
        // System.out.println(age); thorw error here...  will ask for initialized.

        /// IMP-
        // final guarantee immutability only when the instance variable are primitive data type not the reference data
        // type objects and stuff.

        /**
         In simple words: final locks the "variable," not the "data."
         For Primitives: The variable is the value present in the stack memory. If you lock the variable, the value is stuck. (True Immutability).
         For Objects: The variable is just a pointer (address) means reference variable in stack.
         final locks that pointer to one object.
         You can't point it at a new object, but you can still walk over to that object and change what's inside it.


         public class FinalTest {
         public static void main(String[] args) {
         // 1. PRIMITIVE
         final int age = 20;
         // age = 21; //  ERROR: Cannot change the value.

         // 2. REFERENCE TYPE (Object)
         final int[] marks = {80, 90, 95};

         // This is FORBIDDEN:
         // marks = new int[]{10, 20}; //  ERROR: Cannot point to a NEW array.

         // This is ALLOWED:
         marks[0] = 100; //  SUCCESS: The data inside the array changed!
         }
         }


         Summary
         final primitive: The value is constant.
         final object: The reference is constant, but the object itself is still "mutable" (changeable).
         */

        ///  When non-primitive is final you can not reassign it. only you can change the value inside the objects.


        /// Garbage collector i java...-
        // note-java will not allow to delete object manually but allow to perform specific task while objecrt is
        // cleans by GC using finaliz method sort of type Desctrutor.
        // You can specify the specific action that will occers when the object is about to be taken away by the GC
        // using finalize methods like Destructor.


        // creating object many
        A obj;

        for (int i = 0; i < 1000000000; i++) {

            obj = new A("aarav");
        }

        // actual happen something like this...
        /**

         STACK                         HEAP (Memory)
         (References)                  (Actual Objects)

         +----------+                 +-------------------------+
         |   ...    |                 | [Address 0] A("aarav")  | <-- Waiting for GC
         +----------+                 +-------------------------+
         |   obj    | ------------+   | [Address 1] A("aarav")  | <-- Waiting for GC
         +----------+             |   +-------------------------+
         |    i     | (value: 4)  |   | [Address 2] A("aarav")  | <-- Waiting for GC
         +----------+             |   +-------------------------+
         |   ...    |             |   | [Address 3] A("aarav")  | <-- Waiting for GC
         +----------+             |   +-------------------------+
         +-->| [Address 4] A("aarav")  | <-- ACTIVE
         +-------------------------+
         */


        A obj1= new A("random name");
        System.out.println(obj1); // it will print has value
        // println initially called toString method something like this obj.toString();
        ///  if toString methods is not present in object class it will take default toStirng methods which is
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }


    static class A {
        final int num = 10;
        String name;
        public A (String name){
            System.out.println("Object is being created.");
            this.name = name;
        }
        // performing specific task in gc using finalize methods.

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed.");
        }
    }
}
