//Type Casting...

public class type{
	public static void main(String[]args){
	//Auto conversion
	int num = 20;
	
	//01.source and distination both are same data type
	int value = num;
	
	System.out.println("Number is :" + num);
	System.out.println("Value is :" + value);
	
	double result1 = 80.5;
	double result2 = result1;
	
	System.out.println("Result is :" + result1);
	
	//02.Distination is larger than source
	byte amount = 5;
	int Amount1 = amount;
	
	System.out.println("Amount1 is :" + amount);
	
	//03.Manual Casting
	int random1 = 100;
	
	//04.Source is larger than the destination int 32bits and short 16bits
	short random2 = (short) random1;
	
	System.out.println("Random 2 is :"+ random2);
	
	//05.Manual Casting 02nd example
	double mark1 = 99.98;
	float Mark_2 = (float)mark1;
	
	System.out.println("Mark_2 is :"+ mark1);
	
	float mycode = 66.8f;
	int Mycode = (int)mycode;
	
	System.out.println("Mycode is "+Mycode);
	
	//source 64 destination 32
	double Value_1 = 177.7;
	int Value_2 = (int)Value_1;
	
	System.out.println("Value_2 is "+Value_2);
	}


}