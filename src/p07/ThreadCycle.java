class Thread1 extends Thread{
	public void run(){
		System.out.println("Thread1:" + getState());
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread1:" + getState());
				System.out.println("Thread 1 :"+i);
				System.out.println("Thread 1 asleep for 2 seconds");
				Thread.sleep(2000);
				System.out.println("Thread1:" + getState());
			}
		}catch(InterruptedException e) {
			System.out.println("Thread 1 asleep");
		}
		System.out.println("Thread 1 finished execution.");
	}
}

class Thread2 extends Thread{
	public void run() {
		try {
			for(int i=10;i<=15;i++) {
				System.out.println("Thread 2:"+ i);
				System.out.println("Thread 2 asleep for 2 seconds");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread 2 asleep");
		}
		System.out.println("Thread 2 finished execution.");
	}
}

public class ThreadCycle {
	public static void main(String[] args) throws InterruptedException{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		System.out.println("Starting Threads:");
		System.out.println("State before start: " + t1.getState());
        t1.start();
        System.out.println("State after start: " + t1.getState());
        Thread.sleep(100); 
        System.out.println("State while sleeping: " + t1.getState());
		t1.join(); 
        System.out.println("State after completion: " + t1.getState());
        t2.start();
	}

}
