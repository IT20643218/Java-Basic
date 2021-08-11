package Ex_05;

public class PartTimeStudent extends Student4 {
	
	int noOfHours;
	
	public PartTimeStudent (String newName,String newAddress,String newStudentid,int newnoOfHours) {
		super(newName,newAddress,newStudentid);
		noOfHours = newnoOfHours;
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println("My Working Hours are :"+noOfHours);
	}
}
