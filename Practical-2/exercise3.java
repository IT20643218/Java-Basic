//Scanner class

import java.util.Scanner;//add java liabriries

public class exercise3{
	
	public static void main(String[] args){
	
	int height, width, length, volume;
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter length of cube: ");
	length=sc.nextInt();
	
	System.out.print("Enter height of cube: ");
	height=sc.nextInt();
	
	System.out.print("Enter width of cube: ");
	width=sc.nextInt();
	
	volume = length* height* width;
	
	System.out.println("Volume of cube: "+ volume);
	}

}