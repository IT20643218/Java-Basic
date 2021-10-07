package q1;

public class StringBasic {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		
		char s[]= {'H','E'};
		str = new String(s);
		
		System.out.println(str);
		String s = "Hello";
		str = s;
		str = new String("Hello");
		
		str.concat("World");
		System.out.println(str);
	}

}
