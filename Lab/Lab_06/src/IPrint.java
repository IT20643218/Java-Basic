
public interface IPrint {
	void printLine();
	void printDetails();
}

abstract class Item implements IPrint{
	private int itemNo;
	private String name;
	private double unitPrice;
	private int qty;

	public Item(int itemNo, String name, double unitPrice, int qty) {
		this.itemNo= itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	public void printLine() {
		System.out.print("Item No :"+itemNo+"Name :"+name+"Unit Price :"+unitPrice+"Quantity :"+qty);
	}
	
	public void printDetails() {
		System.out.println("Item No :"+itemNo);
		System.out.println("Name :"+name);
		System.out.println("Unit Price :"+unitPrice);
		System.out.println("Quantity :"+qty);
	}
}

class Tablet extends Item {
	
	private String brand;
	private String model;
	private String camera;
	
	public Tablet(int itemNo, String name,double unitPrice,int qty,String brand,String model,String camera) {
		super(itemNo,name,unitPrice,qty);
		this.brand = brand;
		this.model = model;
		this.camera = camera;
	}
	
	public void printLine() {
		super.printLine();
		System.out.print("Brand :"+brand+"Model :"+model+"Camera :"+camera);
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Camera :"+camera);
	}
}


class Vegetables extends Item {
	private boolean organic;
	private int colories;


public Vegetables(int itemNo, String name,double unitPrice,int qty,boolean organic,int colories) {
	super(itemNo,name,unitPrice,qty);
	this.organic = organic;
	this.colories = colories;
}

public void printLine() {
	super.printLine();
	System.out.print("Organic :"+organic+"Colories :"+colories);
}

public void printDetails() {
	super.printDetails();
	System.out.println("Organic :"+organic);
	System.out.println("Colories :"+colories);
	}

}

class MainApp {
	
	public static void main(String args[]) {
		Tablet t1 = new Tablet(100,"Tablet",200000,5,"Sony","5S","12-Magapixel");
		Tablet t2 = new Tablet(200,"Tablet",500000,10,"Apple","I11","50-Magapixel");
		
		Vegetables v1 = new Vegetables(20,"Carrot",30,5,false,50);
		Vegetables v2 = new Vegetables(50,"Red Bean",60,3,true,80);
		
		IPrint arr[]= new IPrint[4];
		arr[0]= t1;
		arr[1]= t2;
		arr[2]= v1;
		arr[3]= v2;
		
		for(int i =0;i < 4;i++) {
			arr[i].printLine();
			System.out.println();
		}
	}

}





