package Ex03;

public class ChildThreads2 extends Thread{
	public void run() {
		for (int x =0;x<5;x++) {
			System.out.println(Thread.currentThread().getName()+" "+ x);
		}
	}
	
}
