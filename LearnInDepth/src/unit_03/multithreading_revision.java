package unit_03;

class MyThread1 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i<100) {
			System.out.println("My Cooking Thread is Running");
			System.out.println("I am happy!");
			i++;
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i<100) {
			System.out.println("Thread 2 for Chatting with her");
			System.out.println("I am sad!");
			i++;
		}
	}
}

public class multithreading_revision {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

	}
}
