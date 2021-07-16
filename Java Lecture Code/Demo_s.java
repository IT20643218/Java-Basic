public class Demo_s{
	public static void main(String[]args){
		
		Student s1 = new Student("IT1020","Kamal");
		Student s2 = new Student("IT1010","Wimal");
		
		Student.setBatchid("Batch 01");
		
		System.out.println("Sitno :"+ s1.getSitno()+" Name :"+ s1.getName() + " Batch ID :"+s1.getBatchid());
		System.out.println("Sitno :"+ s2.getSitno()+" Name :"+ s2.getName() + " Batch ID :"+s2.getBatchid());
		
		Student.setBatchid("Batch 02");
		
		System.out.println("later");
		System.out.println(s1.getBatchid());
		System.out.println(s2.getBatchid());
		
	}	

}