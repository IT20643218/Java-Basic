import java.util.*;

class Student{
	int ditno;
	String name ,address;
	
	public Student(){
		this.ditno = 1234;
		name = "Sumdha";
		address = "1234,Abcde";
	}

}
public class Test{
	public static void main (String args[]){
	Scanner input = new Scanner (System.in);
	Student s1 = new Student();
	 
	 System.out.println(s1.name +" " +s1.address);
	 s1.name = "perera";
	 System.out.println(s1.name +" " +s1.address);
	
	
	}
	
}