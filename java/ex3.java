//get key board inputs

import java.util.Scanner;//to identify class
//import java.util.*;
public class ex3{
	public static void main(String args[]){
		System.out.println("Hello World");
		Scanner ob=new Scanner(System.in);
		System.out.print("Please Enter your age :");		
		int age=ob.nextInt();
		System.out.print("Please Enter your name :");	
		String name=ob.next();
		int a=age+10;
		System.out.println("Hello "+name+" After 10 years your age will be "+a);
	}

}

//Java Programm run using commend 
/*C:\java\Java-Basic\java>javac ex3.java

C:\java\Java-Basic\java>java ex3
Hello World

C:\java\Java-Basic\java>*/