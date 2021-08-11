/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */

package Ex1;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book bookob = new Book();
			Student stuob = new Student();
			
			IDisplay object1 = new Book();//create variable IDisplay
			
			IInput object2 = new Book();//create variable IInput
			
			bookob.input();
			bookob.printDetails();
	}

}
