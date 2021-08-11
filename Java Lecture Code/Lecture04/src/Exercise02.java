abstract class Ancester{
	abstract void method();
}

class Parent extends Ancester{

	@Override
	void method() {
		// TODO Auto-generated method stub
		System.out.println("Parent Class");
	}
	
}
public class Exercise02 {
	public static void main(String[]args) {
		Ancester parent = new Parent();
		parent.method();
	}
}
