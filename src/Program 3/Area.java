import java.util.Scanner;
import shapes.*;

public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        Square s = new Square(side);

        // Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);

        // Triangle
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        Triangle t = new Tri(base, height);

        System.out.println("\nArea of Square: " + s.getArea());
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Triangle: " + t.getArea());

        sc.close();
    }
}
