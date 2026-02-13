package DSA.oop.oop3.inheritance;

public class BoxPrice extends BoxWeight{
   double cost;

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(BoxWeight other, double cost) {
        super(other);
        this.cost = cost;
    }

    public BoxPrice(double length, double height, double width, double weight, double cost) {
        super(length, height, width, weight);
        this.cost = cost;
    }
}
