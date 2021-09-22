package Ex01;

//Threads create extended approach

public class MyMain {

	public static void main(String[] args) {
		Child1 threads1 = new Child1();
		threads1.start();
		
		//Child1 threads2 = new Child1();
		//threads2.start();
		
		Child2 threads2 = new Child2();
		threads2.start();
		
		//to change the background
			for (int x=0;x<10;x++) {//this is a one threads ,this is not a 10 threads,that will create only one child threads
				System.out.println("Main Threads "+ x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}
