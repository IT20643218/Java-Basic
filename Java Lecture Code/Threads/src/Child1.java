//Threads create Runnable approach

public class Child1 implements Runnable {
		public void run() {
			//changing the speed
			for (int x =0 ;x<10;x++) {
				System.out.println("Child Threads " + x );
			}
			
		}
}
