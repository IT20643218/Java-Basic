package Ex_04;

public class Student3 {
	
	private String name,dit,address;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDit() {
		return dit;
	}


	public void setDit(String dit) {
		this.dit = dit;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	//Method
	String getDetails() {
		String s = "I am a Student. \nMy name is " + getName() + "\nI am from " +getAddress() +"\nMy dit no is "+getDit() +"\n";
		return s;
	}
	
	public String getName1() {
		return name;
	}
	
	public void setName1(String name) {
		this.name =name;
	}
	
	
	
}

