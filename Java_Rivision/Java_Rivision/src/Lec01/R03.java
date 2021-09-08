package Lec01;

import java.util.*;

public class R03 {

	public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
		
	System.out.print("Enter Number 01:");
	int num01 = ab.nextInt();
	
	System.out.print("Enter Number 02:");
	int num02 = ab.nextInt();
	
	System.out.print("Enter Number 03:");
	int num03 = ab.nextInt();
	
	if ((num01 > num02) && (num01> num03)){
		System.out.print("The Graterst Number is:"+num01);
	}
	if ((num02 > num01) && (num02> num03)){
		System.out.print("The Graterst Number is:"+num02);
	}
	if ((num03 > num02) && (num03>num01)) {
		System.out.print("The Graterst Number is:"+num03);
	}
	
	
		
	}

}
