class Box{
	int height;
	int width;
	int length;
}

class BoxDemo{
	public static void main(String[]args){
		Box b1;
		b1 = new Box();

		Box b2;
		b2 = new Box();

		Box b3;
		b3 = b1;

		Box b4;
		b4 = b2;
		b2 = b3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("Now b2 :"+b2);
	}
	
}

