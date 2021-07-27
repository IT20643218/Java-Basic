/*
 ** Inheritance
	** Person - (Name, ID, Address, Age)
		Employee (EmployeeID, Salary, EType)
			Administration (AccessLevel, Allowance)
			Doctor(RegNo., Specialty)
				Specialist (Allowance)
				Surgeon
				
			
*/

class Person{
	String name,id, address;
	int age;
	
	public Person(String name,String id,String address,int age){
		this.name = name;
		this.id = id;
		this.address = address;
		this.age = age;
	}
	public void print(){
		
	}
}

class Employee extends Person{
	String employeeID, eType;
	int salary;
	public Employee(String name,String id,String address,int age,String employeeID,String eType,int salary){
		super(name,id,address,age);
		this.employeeID = employeeID;
		this.eType = eType;
		this.salary = salary;
	}
	public void printSalary(){
		System.out.println(this.salary);
	}
}

class Doctor extends Employee{
	String specialization;
	int allowance;
	public Doctor(String name,String id,String address,int age,String employeeID,int salary, String specialization, int allowance){
		super(name,id,address, age, employeeID,"Doctor",salary);
		this.specialization = specialization;
		this.allowance = allowance;
	}
	//overiding
	public void printSalary(){
		System.out.println(salary + allowance);
	}
	
	
}
public class Main{
	public static void main(String args[]){
		Person p1 = new Person("ABC", "a1111", "123 ABC", 10);
		Employee e1 = new Employee("ABC", "a1111", "123 ABC", 10, "EMP1001","Doctor",100000);
		e1.printSalary();
		Doctor d1 = new Doctor("ABC", "a1111", "123 ABC", 10, "EMP1001",200000, "Surgeon", 10000);
		d1.printSalary();
	}


}