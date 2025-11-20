import shapes.*;

public class Area {
    public static void main(String[] args) throws Exception {
       Square s=new Square(4);
       Circle c=new Circle(4);
       Tri t=new Tri(5, 10);
       System.out.println("Area of Square: " +s.getArea());
        System.out.println("Area of Circle: " +c.getArea());
         System.out.println("Area of Tri: " +t.getArea());
    }
}
