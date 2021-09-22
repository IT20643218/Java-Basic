package Ex03;

public class MyMain {

	public static void main(String[] args) {
		ChildThreads1 thread1 = new ChildThreads1();
		thread1.setName("Child Thread 1");
		thread1.start();
		
		ChildThreads2 thread2 = new ChildThreads2();
		thread2.setName("Child Thread 2");
		thread2.start();
		
		//MainThread thread3 = new MainThread();
		//thread3.start();
		
		//to change the background
			for (int x=0;x<10;x++) {//this is a one threads ,this is not a 10 threads,that will create only one child threads
				System.out.println("Main threads");
			}

	}

}
