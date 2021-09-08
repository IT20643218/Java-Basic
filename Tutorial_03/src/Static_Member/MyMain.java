package Static_Member;

public class MyMain {

	public static void main(String[] args) {
		Feet newfeet = new Feet(3,4);
		Feet ob1 = new Feet(5,6);
		Feet ob2 = new Feet(6,7);
		Feet newob = new Feet(0,0);
		newob.add(ob2, ob2);
		newob.print("Length");
		newfeet.print(newfeet);

	}

}
