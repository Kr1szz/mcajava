package shapes;

public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public double getArea(){
        return 3.1459*radius*radius;
    }
}
