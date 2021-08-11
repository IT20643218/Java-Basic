public class Demo_b{
	public static void main (String[]args){
		EvenOddNumber num = new EvenOddNumber();
		
		boolean result = num.findEvaenOrOddNumber(5);
		
		if (result==true){
			System.out.println("This is an even number");
		}else{
			System.out.println("This is an odd number");
		}
		
	}
}