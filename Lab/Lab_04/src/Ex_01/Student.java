package Ex_01;

//Identify variable
public class Student {
	private int StudentID;
	private String name,degree,mobile;
	
	private static int max = 100;//define static propaty
	
	//Constructor
	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	//static
	public int getNextStudentID() {
		return max++;
		
	}
	
	public void print() {
		System.out.println("Student Name :"+getName());
		System.out.println("Degree :"+getDegree());
		System.out.println("Mobile :"+getMobile());
		System.out.println("Student ID :"+getNextStudentID());
		
		System.out.println("=========================================");
	}
	
	}
	
	

