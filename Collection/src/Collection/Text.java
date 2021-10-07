package Collection;

import java.util.ArrayList;


public class Text {
	public static void main(String[]args) {
		listTotal(addElemenets());
		}
	
	
	public static ArrayList<Integer> addElemenets(){
		ArrayList<Integer> my = new ArrayList<>();
		
		my.add(10);
		my.add(20);
		my.add(30);
		my.add(40);
		
		return my;
		
	}
	public static void listTotal (ArrayList<Integer>list) {
		int tot =0;
		
		for(Integer x:list) {
			tot=tot+x;
			System.out.println(x +"  is the number");
			System.out.println(tot +"  is the total");
		}
	}
}
