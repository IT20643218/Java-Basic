package Ex_05;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Gayan","Colombo");
		
		p1.showDetails();
		
		Student4 s1 = new Student4 ("Kamal","Colombo","IT20643218");
		s1.showDetails();
		
		PartTimeStudent pt1 = new PartTimeStudent("Sumedha","Boralesgamuwa","IT25042010",16);
		pt1.showDetails();
	}

}
