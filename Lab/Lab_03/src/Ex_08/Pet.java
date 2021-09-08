package Ex_08;

public class Pet {

		private String name;
		protected String owner;
		private int age;
		
		public Pet(String n, String o, int a) {
			this.name = n;
			this.owner = o;
			this.age = a;
		}
		//Overloading constructor
		public Pet (String n,String o) {
			this.name =n;
			this.owner =o;
			this.age =0;
		}
		
		public void showDetails(){
		System.out.println("\nI am a pet. My name is "+this.name+".My owner is "+this.owner+". My age is "+this.age);
		
	}
		
}//end of the pet class

class Cat extends Pet{
	private int livesLeft;
	
	public Cat(String n, String o, int a, int l) {
		super(n, o, a);
		this.livesLeft = l;
	}
	
	//overloading constructor
	public Cat(String n,String o) {
		super(n,o,0);
		this.livesLeft = 7;
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("\nI am a Cat. I have "+this.livesLeft+" lives to live");
		
	}
	
	
	
	
}//end of the pet class

