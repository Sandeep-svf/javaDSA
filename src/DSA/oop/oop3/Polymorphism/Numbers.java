package DSA.oop.oop3.Polymorphism;

public class Numbers {

   /// Method over loading
   /*

   Method Overloading is the ability to define multiple methods with the same name in the same class,
   distinguished by the number, type, or order of their parameters.

      ┌─────────────────────────────────────────────────────┐
      │                  CLASS: Logger                      │
      ├─────────────────────────────────────────────────────┤
      │  + log(message: String)                             │ <── (1 String)
      ├─────────────────────────────────────────────────────┤
      │  + log(message: String, code: Int)                  │ <── (String + Int)
      ├─────────────────────────────────────────────────────┤
      │  + log(code: Int)                                   │ <── (1 Int)
      └─────────────────────────────────────────────────────┘
           ▲                  ▲                  ▲
           │                  │                  │
    [ log("Error") ]   [ log("Fail", 404) ]   [ log(500) ]


    Real word code example...

    public class PaymentManager {

    // Overload 1: Basic payment
    void processPayment(double amount) {
        System.out.println("Processing cash: " + amount);
    }

    // Overload 2: Payment with a card (Different parameter type)
    void processPayment(String cardNumber) {
        System.out.println("Processing card: " + cardNumber);
    }

    // Overload 3: Payment with amount and discount (Different number of parameters)
    void processPayment(double amount, String couponCode) {
        System.out.println("Processing " + amount + " with coupon " + couponCode);
    }
}

   * */


   /**
    * The 3 Golden Rules for Overloading
    * To successfully overload a method, you must change at least one of the following:
    *
    * Number of parameters: add(int a) vs add(int a, int b).
    *
    * Data type of parameters: print(String s) vs print(int i).
    *
    * Order of parameters: task(String s, int i) vs task(int i, String s).
    *
    * Note: Changing the Return Type alone does NOT count as overloading and will result in a compile error.*/



   /*
   * Senior-Level Interview Tips (4 YOE)
    Why use it? It improves code readability (cleaner than naming methods logString(), logInt(), logDouble()).

    Kotlin's Shortcut: In Kotlin, you often don't need overloading because of Default Arguments. Instead of 3
    * versions of a function, you write one:
    fun log(msg: String, code: Int = 0).

    Performance: Overloading has zero runtime overhead because the decision is made during compilation
    * (unlike Method Overriding).*/


    int sum (int a , int b){
        return a+b;
    }

    int sum (int a , int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers numbersObj = new Numbers();
        int sum = numbersObj.sum(2,4);
        int sum2 = numbersObj.sum(1,2,3);
    }



}
