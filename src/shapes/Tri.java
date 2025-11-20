package shapes;

public class Tri {
    private  double base;
    private  double height;
    public Tri(double base, double height) {
        this.base = base;
        this.height = height;
    }public double getArea(){
        return 0.5*base*height;
    }
}
