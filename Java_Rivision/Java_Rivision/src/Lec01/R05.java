package Lec01;

import java.util.*;
public class R05 {
	
		public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		System.out.print("Please Enter Number of Stars :");
		int num=a.nextInt();
		
		System.out.print("=======================\n");
		
		for (int i=0;i<num;i++){
		//inner loop to handle number spaces
		//value changing acc to requirement
		
		for(int j=num-i;j>1;j--)
		{
		
		//printing spaces
		System.out.print(" ");
		
		}
		
		//inner loop to handle number of columns
		//values changing acc to other loop
		
		for(int j=0;j<=i;j++)
		{
		
		//printing stars
		System.out.print("* ");
		
		}
		
		//ending after the each row
		System.out.println();
		}
		}

	
}
