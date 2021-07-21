public class JavaApplication2{
	public static void main (String[] args){
		 Square1 s1 = new Square1(10,10);//constructor
		 Square1 s2 = new Square1(10,10);//constructor
		 
		 boolean result = s1.CompareTwo(s2);
		 		 
		 Square1 s3 = new Square1(s1);
		 Square1 s4 = new Square1(s2);
		 
		 System.out.println(s3 = new Square1(s1));
		 System.out.println(s4 = new Square1(s2));
	}


}