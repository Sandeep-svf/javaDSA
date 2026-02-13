package DSA.oop.oop3.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.height=-1;
        this.length=-1;
        this.width=-1;
    }

    // cube
    Box(double side){

        // super(); Object Class
        this.width = side;
        this.length = side;
        this.height = side;
    }

    /// Experiment - creating static method here and see what happend


    static void greeting(){
        System.out.println("hey! i am in box class.");
    }


    // pass three arguments in constructor
     Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // copy constructor
    Box(Box old){
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }

    public void information(){
        System.out.println("Running the box.");
    }

}
