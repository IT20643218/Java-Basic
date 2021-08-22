package Ex_01;

public class MyMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Manipulation
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer(" World");
		sb.append(sb1);
		
		System.out.println(sb);
		
		//replace function
		StringBuffer sb4 = new StringBuffer("Hello");
		StringBuffer sb5 = new StringBuffer(" World");
		sb.replace(0, 1, "SA");
				
		System.out.println(sb);
				
		
		//charAt
		char nesw = sb.charAt(5);
		System.out.println(nesw);
		
		//insert
		sb.insert(1, "JAVA");
		System.out.println(sb);
		
		//Reverse function
		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = new StringBuffer(" World");
		sb.reverse();
				
		System.out.println(sb);
				
	}

}
