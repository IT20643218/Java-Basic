package Lec01;

import java.util.*;

public class R02 {
	public static void main(String[] args) {
		Scanner le=new Scanner (System.in);
		
	//find the area of the rectangle
		System.out.print("Enter Length :");
		int length = le.nextInt();
		
		System.out.print("Enter Width :");
		int width = le.nextInt();
		
		float area = length*width;
		
		System.out.println("========================================");
		System.out.println("Area of the rectangal :"+area);
		
		
		
	}

}
