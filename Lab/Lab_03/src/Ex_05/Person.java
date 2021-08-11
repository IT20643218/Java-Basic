package Ex_05;

public class Person {
	String name,address;
	
	//Parameterized constructor
	public Person(String setName,String newAddress) {
		name = setName;
		address = newAddress;
	}
	
	void showDetails() {
		System.out.println("My Name is "+name+"\nI am from "+address+"\n");
	}
}
