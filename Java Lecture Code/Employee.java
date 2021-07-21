public class Employee{
	private String Employeename;
	
	private final String DepartmentID;
	
	public Employee(String ename , String sDeid){
		Employeename = ename;
		DepartmentID = sDeid;
	}
	
	public String getEmpName(){
		return Employeename;
	}
	
	public void setName(String sname){
		Employeename = sname;
	}
	public String setDepartmentID(){
		return DepartmentID;
	}
	
	/*public void setDepartmentID(String sDeid){
		DepartmentID = sDeid;
	}*/


}