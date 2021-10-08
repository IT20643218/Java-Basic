package Genarics;

public class BoxUnbox {

	public static void main(String[] args) {
		int num = 100;
		
		Integer i = new Integer(num); //boxing-wrapping
		Integer j = 60; //auto wrapping
		
		System.out.println(i.intValue());//Un boxing - wrapping
		System.out.println(i); //auto Un boxing - auto Wrapping

	}

}
