package Genarics;

import java.util.ArrayList;
import java.util.Collection;

public class Genarics1 {

	public static void main(String[] args) {
		//Question 01
		Collection<String> ob = new ArrayList<>();
		ob.add("Sumedha");
		ob.add("Lakmal");
		ob.add("Nimal");
		ob.add("Sunil");
		
		for(String name:ob) {
			System.out.println(name);
		}
		
		
	}

}
