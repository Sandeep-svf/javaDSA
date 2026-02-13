package DSA.oop.oop3.Polymorphism;

public class Circle extends Shape{

    // if we want to check function is overridden or not use annotation @Override.
    // This will run when the obj of Circle is created
    // hence, it is overriding the parent method.


    //  if we change function name which is not match to parent class @Overridden throw error.
    @Override // this is annotation ( check if method id overridden)
    void area(){
        System.out.println("Area is 2*pi*r");
    }
}
