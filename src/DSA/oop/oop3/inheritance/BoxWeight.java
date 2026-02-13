package DSA.oop.oop3.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
        // this.length = 8;  if in parent class set length to private can not be used here.
    }

    /// Note-Subclass can not access private stuff form it's parent class.
    /// but here   super(length, height, width);  // what is this...? it will work becoz Box class is initializing it.
    /// not BoxWeight class.





    /// super class variable can be used to reference any object form that derived class
    /// hence, we are abot to pass box weight object to the box constructor
    BoxWeight (BoxWeight other){
        this.weight = other.weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);  // what is this...?
        ///  basically means-call the parent class constructor.
        ///  used to initialized value present in parent class.
        this.weight = weight;

        /// here we have to first call super and initialized parent class first ...
        /// it we will do it later after weight then it will give error bcoz child class care about what parent class
        /// contain so we have to initialized it first.
        //super(length, height, width);

        /// if in child class super class is not called then here default constructor of parent class will be called.

    }
}
