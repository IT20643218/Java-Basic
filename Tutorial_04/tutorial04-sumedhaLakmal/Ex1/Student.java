/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */
package Ex1;

import java.util.*;

public class Student implements IInput,IDisplay {
	private int StudentID;
	private String Name;
	
	public void print() {
		System.out.println("Student ID :"+this.StudentID+"Name :"+this.Name);
	}
	
	public void printDetails() {
		System.out.println("Student ID :"+this.StudentID);
		System.out.println("Name :"+this.Name);
	}
	
	public void input() {
		Scanner bc = new Scanner(System.in);
		
		System.out.println("Enter Student ID :");
		this.StudentID = bc.nextInt();
		
		System.out.println("Enter Student ID :");
		this.Name = bc.nextLine();
		
	}
}
