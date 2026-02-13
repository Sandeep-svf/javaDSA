package DSA.oop.oop3.encapsulation.accessControl;

public class Main {


    public static void main(String[] args) {
        A aObj = new A(10,"Sandeep Maurya");

        // Need to do few things
        //1-> Access the data members
        //2-> Modify the data members

        aObj.setNum(12);
        System.out.println(aObj.getNum());
    }




}
