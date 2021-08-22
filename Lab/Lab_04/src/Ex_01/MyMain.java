package Ex_01;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s10 ="Hello";
			String s20 ="Hello";
			System.out.println(s10==s20);//true
			
			String s30 = new String("Hello World");
			String s40 = new String("Hello World");
			System.out.println(s30==s40);//false
			
			System.out.println("++++++++++++++++++++");
			
			String s1 ="Java";
			String s2 ="java";
			String s3 =new String("java");
			String s4 =new String("Java");
			String s5=s4;
			
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals("Java"));
			System.out.println(s3.equals(s4));
			System.out.println(s5.equals(s4));
			System.out.println(s5==s4);
			
			System.out.println("++++++++++++++++++++");
			//String Operations - length
			System.out.println(s10.length());
			System.out.println(s30.length());
			
			//toUpperCase
			String upper1 = s10.toUpperCase();
			System.out.println(upper1);
			
			String upper2 = s30.toUpperCase();
			System.out.println(upper2);
			
			//startWith
			System.out.println(s10.startsWith("H"));
			
			//substring
			System.out.println(s30.substring(3,7));
	}

}
