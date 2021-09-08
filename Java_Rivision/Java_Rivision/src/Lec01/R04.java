package Lec01;
import java.util.*;
public class R04 {

	public static void main(String[] args){
		Scanner b=new Scanner(System.in);
		System.out.print("Please Enter Number of Astrics:");
		int num=b.nextInt();

		System.out.print("=======================\n");
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++)
		{
			System.out.print("*");		
		}
		System.out.println("\n");
		}
		
	}
	
}
