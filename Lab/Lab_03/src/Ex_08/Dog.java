package Ex_08;


public class Dog extends Pet {
	
	private int noOfMasters; 
	
	public Dog(String n, String o, int a, int m) {
		super(n ,o ,a);
		this.noOfMasters = m;
	}
	
	//overloading constructor
		public Dog(String n,String o) {
			super(n,o);
			this.noOfMasters = 5;
	}
	
		public void showDetails(){
			super.showDetails();
			System.out.println("\nI am a Dog. I have "+this.noOfMasters+" masters at home.");
			
		}
}