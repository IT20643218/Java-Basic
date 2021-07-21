public class JavaApplication{
	public static void main(String[] args){
		Employee emp1 = new Employee("Kumara","1500");
		Employee emp2 = new Employee("Saman","1600");
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());
		
		System.out.println(emp1.setDepartmentID());
		System.out.println(emp2.setDepartmentID());
	}


}