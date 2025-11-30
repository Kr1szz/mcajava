package shapes;

public class Square {
    private double Side;
    
    public Square(double side) {
        this.Side = side;
    }
    
    public double getArea() {
        return Side * Side;
    }
}
