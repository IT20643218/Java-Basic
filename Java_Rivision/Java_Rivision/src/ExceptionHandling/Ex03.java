package ExceptionHandling;

public class Ex03 {

	public static void main(String[] args) throws NumberFormatException ,ArithmeticException{
		int no = Integer.parseInt("123a");
		System.out.println(no);
	}

}
