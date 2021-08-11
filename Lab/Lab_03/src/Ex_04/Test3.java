package Ex_04;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object
		Student3 s1 = new Student3();
		s1.setName("Kumara");
		s1.setDit("IT202050");
		s1.setAddress("Gall");
		
		Student3 s2 = new Student3();
		s2.setName("Nimal");
		s2.setDit("IT202080");
		s2.setAddress("Colombo");
		
		
		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());
		
		
	}
}
