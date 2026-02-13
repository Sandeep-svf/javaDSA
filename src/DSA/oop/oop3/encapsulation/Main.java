package DSA.oop.oop3.encapsulation;

public class Main {

    /**
     Encapsulation -> Wrapping up the implementation of the data member and methods in a class.
     ( note- It basically hide the code and all the data in to single entity or unit so that can be protected form the
     outside the words.)

     -------------------- BOTH ARE DIFFERENT -------------------------------------------------------------------------

     Abstraction -> Hiding the unnecessary details adn showing the essential information.



     Difference between Abstraction and Encapsulation
     This is a very common senior-level follow-up question:

     Abstraction is about hiding complexity at the design level (using interfaces/abstract classes).

     ---------------------------------------- CODE EXAMPLE ABSTRACTION -----------------------------------------------

     Here is how you would write this using an Interface (the most common way to achieve abstraction in modern Java).

     // The Abstraction (The Contract)
     interface PaymentProcessor {
     void pay(double amount); // We don't know HOW it pays yet
     }

     // Implementation 1: UPI
     class UpiPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
    System.out.println("Connecting to NPCI... Verifying UPI PIN... Paid ₹" + amount);
    }
    }

     // Implementation 2: Credit Card
     class CardPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
    System.out.println("Connecting to Visa/Mastercard... Verifying CVV... Paid ₹" + amount);
    }
    }

     // Real-Time Usage
     public class Checkout {
     public static void main(String[] args) {
     // We use the Abstraction (PaymentProcessor) to handle any type of payment
     PaymentProcessor myPayment = new UpiPayment();
     myPayment.pay(500.00);
     }
     }

     Encapsulation is about hiding data at the implementation level (using private variables and getters/setters).


     ---------------------------------------- CODE EXAMPLE ABSTRACTION -----------------------------------------------
     Let’s use a User Account example, similar to what you might build for a fintech app like Cred.
     We want to ensure the balance cannot be set to a negative value by mistake.

     public class BankAccount {
     // 1. Data Hiding: Private variables cannot be accessed directly
     private double balance;
     private String accountNumber;

     public BankAccount(String accNo, double initialBalance) {
     this.accountNumber = accNo;
     this.balance = initialBalance;
     }

     // 2. Getter: Controlled read access
     public double getBalance() {
     return balance;
     }

     // 3. Setter: Controlled write access with VALIDATION
     public void deposit(double amount) {
     if (amount > 0) {
     balance += amount;
     System.out.println("Successfully deposited: " + amount);
     } else {
     System.out.println("Invalid deposit amount!");
     }
     }
     }

     // Usage in Main
     public class Main {
     public static void main(String[] args) {
     BankAccount user = new BankAccount("12345", 1000.0);

     // user.balance = -5000; // ERROR: balance is private (Prevents corruption)

     user.deposit(500); // SUCCESS: Access via public method
     System.out.println("Current Balance: " + user.getBalance());
     }
     }



     ABSTRACTION EXAMPLE

     System.out.println() — Why It Is Abstraction

     When you write:

     System.out.println("Hello");


     You don't know:

     How characters are converted to bytes

     How buffering works

     How JVM talks to OS

     How OS writes to console

     How console renders characters

     You just use:

     println()


     Let’s break it slightly:

     System → class

     out → static object of type PrintStream

     println() → method inside PrintStream

     Internally it does:

     Synchronization

     Encoding

     Writing to output stream

     Flushing buffer

     But you don’t care.

     That’s abstraction.

     ArrayList — Perfect Abstraction Example

     When you use:

     ArrayList<String> list = new ArrayList<>();
     list.add("Sam");
     list.add("Rahul");
     System.out.println(list.get(0));


     You don’t know:

     How resizing happens

     How internal array grows

     How memory reallocation happens

     How shifting works

     How index checking works

     Internally:

     It uses a dynamic array

     When full → creates bigger array

     Copies old data

     Replaces reference

     But you just use:

     add()
     get()
     remove()
     size()


     That’s abstraction.


     */
}
