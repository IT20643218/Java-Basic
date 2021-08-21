package Ex_01;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[] = new Student[5];
		
		s[0]= new Student("Kamal","IT","0707078124");
		s[1]= new Student("Aamal","SE","0747078124");
		s[2]= new Student("Samal","ISE","0757078124");
		s[3]= new Student("Bimal","NET","0727078124");
		s[4]= new Student("Wimal","IT","0717078124");
		
		
		for (int i=0;i<=4 ;i++) {
			s[i].print();
		}
		
	}

}
