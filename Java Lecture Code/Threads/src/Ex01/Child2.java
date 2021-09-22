package Ex01;

//Threads create extended approach

public class Child2 extends Thread{
	public void run() {
		//changing the score
		for (int x =0 ;x<10;x++) {
			System.out.println("Child Threads 2:" + x );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
