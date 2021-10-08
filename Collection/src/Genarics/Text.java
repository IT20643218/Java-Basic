package Genarics;

public class Text<T , V> {

	private T Attribute;
	private V Attribute1;
	
	public V getAttribute() {
		return Attribute1;
	}
	
	
	
	public void setAttribute(T attribute, V attribute1) {
		Attribute = attribute;
		
	}

	public void show() {
		System.out.println(Attribute);
	
		
	}	
	
}
