//Encapsulation---Protect Variable//

class Student{
	private int id;
	private String name;
	private int age;
	
	//Encapsulation
	public void setid(int id){
		this.id = id;
	}
	
	public int getid(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
}

class Demo{
	public static void main(Strin args[]){
		Student s = new Student();
		s.id = 15000;
		s.name = "Sumedha";
	}
}