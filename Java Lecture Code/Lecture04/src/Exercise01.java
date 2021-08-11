
abstract class Shape{
	abstract double calculateArea();
	
	abstract void display();
}

class Rectangal extends Shape{

	public static final double length = 20.0;
	public static final double width = 10.0;
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		 System.out.println("Display Rectangal");
			
	}
	
}

class Circle extends Shape{

	public static final double radius =140.0;
	
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Circle");
	}
	
}

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape rectangal = new Rectangal();
		Shape circler = new Circle();
		System.out.println("Area of Rectangal :" +rectangal.calculateArea());
		System.out.println("Area of Circle :" +circler.calculateArea());
		
		rectangal.display();
		circler.display();
		
	}

}
