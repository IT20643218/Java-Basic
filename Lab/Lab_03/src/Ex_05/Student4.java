package Ex_05;

public class Student4 extends Person {
	String studentid;
	
	public Student4(String newName,String newAddress,String newStudentid) {
		super(newName,newAddress);
		studentid =newStudentid;
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println("My ID is "+studentid+"\n");
	}
}
