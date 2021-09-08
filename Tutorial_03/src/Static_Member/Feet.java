package Static_Member;

public class Feet {
	private int feet;
	private int inches;
	 public Feet(int feet, int inches){
		 this.feet=feet;
		 this.inches = inches;
	 }
	 
	 public Feet(Feet len) {
		 this.feet=len.feet;
		 this.inches=len.inches;
	 }
	
	 
	// Add f1+f2 feet and store in current feet
	 public void add(Feet f1, Feet f2){
		 int totfeet=f1.feet+f2.feet;
		 int totinch=f1.inches+f2.inches;
		 int restOfFeet = totinch % 12;
		 totfeet = totfeet + restOfFeet;
		 totinch = totinch /12;
		 
		 this.feet = totfeet;
		 this.inches = totinch;
	 }
	 
	// Display a Length e.g 5’6”
	public void print(String msg) {
		System.out.println(msg +":"+this.feet +"' "+this.inches+"\"");
	} 
	
	public static void print(Feet f) {
		System.out.println(f.feet +"' "+f.inches+"\"");
	}

}
