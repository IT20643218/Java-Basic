//Threads create Runnable approach

public class MyMain {

	public static void main(String[] args) {
		Child1 object = new Child1();
		Thread threads1 = new Thread(object);
		
		threads1.start();
		
		//to change the background
			for (int x=0;x<10;x++) {//this is a one threads ,this is not a 10 threads,that will create only one child threads
				System.out.println("Main threads");
			}

	}

}
