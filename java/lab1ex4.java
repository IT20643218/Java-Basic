import java.util.Scanner;

public class lab1ex4{
	public static void main(String[] args){
	Scanner a=new Scanner(System.in);	
	System.out.print("Please Enter your Day Number :");
	int days=a.nextInt();
	
	System.out.print("=======================\n");
	String day;
		System.out.println("Value of the day:"+days);

	switch(days){
	case 1:day="Monday";
		break;
	case 2:day="Tuesday";
		break;
	case 3:day="Wednesday";
		break;
	case 4:day="Thurseday";
		break;
	case 5:day="Friday";
		break;
	case 6:day="Satauday";
		break;
	case 7:day="Sunday";
		break;
	default:day="Invalid Day";
		break;
	}
	System.out.println("Day of the week :"+day);
		System.out.println("Good Bye!");	
	} 
}