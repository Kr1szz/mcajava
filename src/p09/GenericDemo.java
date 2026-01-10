package p09;

import java.util.Scanner;

class Storage<T> {
    T value;

    Storage(T value) {
        this.value = value;
    }

    /* Pgm changes requested, sending array instread of single element */
    Storage(T[] arr) {
        GenericDemo.printArray(arr);
    }

    void display() {
        System.out.println("Value in storage: " + this.value);
    }
}

public class GenericDemo {
    static <E> void printArray(E[] array) {
        System.out.print("Elements of Array: [ ");

        for (E ele : array) {
            System.out.print(ele + ", ");
        }

        System.out.println("]");
    }

    public static void main(String args[]) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Int Storage\n" +
                    "2. Sring Storage\n" +
                    "3. Double Storage\n" +
                    "4. Print Int array\n" +
                    "5. Print Str array\n" +
                    "6. Print Double array\n" +
                    "7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer value:");
                    Storage<Integer> intStore = new Storage<>(sc.nextInt());
                    intStore.display();
                    break;

                case 2:
                    System.out.println("Enter string value: ");
                    Storage<String> strStore = new Storage<>(sc.next());
                    strStore.display();
                    break;

                case 3:
                    System.out.println("Enter double value: ");
                    Storage<Double> doubleStore = new Storage<>(sc.nextDouble());
                    doubleStore.display();
                    break;

                case 4:
                    Integer[] intArray = { 1, 2, 3, 4, 5 };
                    // printArray(intArray);
                    new Storage<Integer>(intArray);
                    break;

                case 5:
                    String[] strArray = { "Hello", "Hi" };
                    // printArray(strArray);
                    new Storage<String>(strArray);
                    break;

                case 6:
                    Double[] dblArray = { 1.61, 2.71, 3.14 };
                    // printArray(dblArray);
                    new Storage<Double>(dblArray);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Improper input");
            }
        } while (choice != 7);
        sc.close();
    }
}
