//Inheritance the person class and create 
//a student class
//the student class should have the following 
//properties
//studentId ,name,mobileno,GPA
//we will have a method called
//displayClass()


class Person {
	protected String name;
	protected String mobileNo;
	
	public Person(){
		mobileNo = "0702013565";
		name = "sumedha";

	}

	public Person(String name,String mobileNo){
	this.name = name;
	this.mobileNo = mobileNo;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void String getMobileNo(){
		return this.mobileNo;
	}
	
	public String setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	public void display(){
		System.out.println("Name = " +
		this.name +", Mobile No = " +
		this.mobileNo);
	}
}

class Student extends Person {
	protected int studentId;
	protected float GPA;
	
	public Student(){
		GPA = 2.0f;
	}
	
	public Student(int studentId, String name,String mobileNo, float GPA){
		super(name,mobileNo);
		this.studentId = studentId;
	}

	public float getGpa(){
		return this.GPA;
	}

	public void setGpa(float GPA){
		this.GPA =GPA;
	}

	public void display(){
		super.display();
		System.out.println("Student Id = "+ this.studentId +", GPA =" +this.GPA);
	}

}

class Main{
	public static void main(String[] args)
	{
		Student std;
		std = new Student(100,"Geetha","07823433251",3.2f);
		std.display();
	}

}
