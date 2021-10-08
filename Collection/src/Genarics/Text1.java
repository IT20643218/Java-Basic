package Genarics;

public class Text1 {

	public static void main(String[] args) {
		
		Text<Integer,String> ob = new Text<>();
		ob.setAttribute(35,"Sumedha");
		ob.getAttribute();
		ob.show();
		
		/*Text<Double> ob1 = new Text<>();
		ob1.setAttribute(35.7);
		ob1.getAttribute();
		ob1.show();
		
		Text<String> ob2 = new Text<>();
		ob2.setAttribute("Sumedha");
		ob2.getAttribute();
		ob2.show();*/
	}

}
