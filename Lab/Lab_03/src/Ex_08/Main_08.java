package Ex_08;

public class Main_08 {

	public static void main(String[] args) {

				Pet p = new Pet("Lissie","Smith",3); 
				p.showDetails(); 
				
				//Overloaded constructor for new born pet
				Pet p1 = new Pet("Tomy","Ana");
				p1.showDetails();
				
				Cat c = new Cat("Kyan", "Silva", 4, 4); 
				c.showDetails(); 
			 
				//Overloaded constructor for new born cat
				Cat c1 = new Cat("Tim","Kuma");
				c1.showDetails();
				
				Dog d = new Dog("Syndy","Nimal");
				d.showDetails();
	}

}//end of the demo class
