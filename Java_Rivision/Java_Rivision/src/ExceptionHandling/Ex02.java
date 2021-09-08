package ExceptionHandling;

public class Ex02 {

	public static void main(String[] args) {
		try {
			
			int no = Integer.parseInt("123a");
			System.out.println("Line After the Exception");
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Catch block");
		}
		
		System.out.println("After the catch block");
		
	}

}
