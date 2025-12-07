package p05;

import java.util.Scanner;

interface Personal {
    void personalDetails(String name, int age);
}

interface Official {
    void officialDetails(String designation, String department);
}

class Employee implements Personal, Official {
    String name, designation, department;
    int age;

    public void personalDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void officialDetails(String designation, String department) {
        this.designation = designation;
        this.department = department;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Department  : " + department);
    }
}

public class MultiInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter Personal Details");
            System.out.println("2. Enter Official Details");
            System.out.println("3. Display Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    emp.personalDetails(name, age);
                    System.out.println("Personal details saved.");
                    break;

                case 2:
                    System.out.print("Enter Designation: ");
                    String desig = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    emp.officialDetails(desig, dept);
                    System.out.println("Official details saved.");
                    break;

                case 3:
                    emp.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
