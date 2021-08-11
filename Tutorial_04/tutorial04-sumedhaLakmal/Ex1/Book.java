/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */

 package Ex1;
 


import java.util.*;


public class Book implements IDisplay ,IInput{
	private String BookID;
	private String Title;
	private String publisher;
	
	public void print() {
		System.out.println("Book ID:"+this.BookID +"Publisher :"+this.publisher+"Title :"+this.Title);
	}
	
	public void printDetails() {
		System.out.println("Book ID :"+this.BookID);
		System.out.println("Publisher :"+this.publisher);
		System.out.println("Title :"+this.Title);
	}
	
	public void input() {
		Scanner ad = new Scanner(System.in);
		
		System.out.print("Enter Book ID :");
		this.BookID = ad.nextLine();
		
		
		System.out.print("Enter Publisher :");
		this.publisher = ad.nextLine();
		
		System.out.print("Enter Title :");
		this.Title = ad.nextLine();
		
		System.out.println("=======================================");
	}
}
