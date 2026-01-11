package p07;

class MyThread1 extends Thread {
    ThreadDemo resource = new ThreadDemo();

    MyThread1(ThreadDemo resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1 :" + i);
        }
        try {
            resource.access();
            System.out.println("Thread1 using resource");
            sleep(1000);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

    }
}

class MyThread2 extends Thread {
    ThreadDemo resource = new ThreadDemo();

    MyThread2(ThreadDemo resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Thread2 :" + i);
        }
        try {
            resource.access();
            System.out.println("Thread2 using resource");
            sleep(1000);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}

public class ThreadDemo {

    synchronized public void access() throws InterruptedException {
        Thread.sleep(500);
    }

    public static void main(String args[]) {
        ThreadDemo resource = new ThreadDemo();
        MyThread1 t1 = new MyThread1(resource);
        MyThread2 t2 = new MyThread2(resource);

        System.out.println("Thread1 state: " + t1.getState());
        System.out.println("Thread2 state: " + t2.getState() + "\n");

        t1.start();
        t2.start();

        System.out.println("Thread1 state: " + t1.getState());
        System.out.println("Thread2 state: " + t2.getState() + "\n");

        try {

            Thread.sleep(100);
            System.out.println("\nThread1 state: " + t1.getState());
            System.out.println("Thread2 state: " + t2.getState() + "\n");

            Thread.sleep(2000);
            System.out.println("\nThread1 state: " + t1.getState());
            System.out.println("Thread2 state: " + t2.getState());
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

    }

}
