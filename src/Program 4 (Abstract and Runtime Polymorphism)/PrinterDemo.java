import java.util.Scanner;

abstract class Printer {
    abstract void configuration();
    abstract void display();
}

class DotMatrix extends Printer {
    public void configuration() {
        System.out.println("Dot-Matrix: 250 cps, 180 dpi");
    }
    public void display() {
        System.out.println("Dot-Matrix Printer: Good for multi-copy printing.");
    }
}

class LaserJet extends Printer {
    public void configuration() {
        System.out.println("LaserJet: 35 ppm, 1200 dpi");
    }
    public void display() {
        System.out.println("LaserJet Printer: Fast and high quality.");
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer p;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n--- Printer Menu ---");
            System.out.println("1. Dot-Matrix");
            System.out.println("2. LaserJet");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                p = new DotMatrix();
                p.configuration();
                p.display();
            } else if (choice == 2) {
                p = new LaserJet();
                p.configuration();
                p.display();
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}