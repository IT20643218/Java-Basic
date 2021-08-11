package Ex_01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object
		/*Student s1 = new Student();
		s1.name = "Kumara";
		s1.dit = "IT202050";
		s1.address = "Gall";
		
		Student s2 = new Student();
		s2.name = "Nimal";
		s2.dit = "IT202080";
		s2.address = "Colombo";*/
		
		Student s1 = new Student("Kumara","IT20604","Colombo");
		Student s2 = new Student("Nimal","IT205048","Galgamuwa");
		
		System.out.println("Name: " + s1.name + "\nDIT Number: " +s1.dit+"\nAddress: "+s1.address +"\n");
		System.out.println("Name: " + s2.name + "\nDIT Number: " +s2.dit+"\nAddress: "+s2.address +"\n");
	}

}
