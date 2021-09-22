package Ex03;

public class ChildThreads1 extends Thread{
	public void run() {
		ChildThreads2 ob = new ChildThreads2();
		ob.start();
		for (int x =0 ;x<10;x++) {
			System.out.println(Thread.currentThread().getName() +" "+ x );
		}
	}
	
}
