//Buffer reader class

import java.io.*;//add java liabriries

public class exercise4{
	
	public static void main(String[] args)throws IOException{
	
	int height, width, length, volume;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader (isr);
	
	System.out.print("Enter length of cube: ");
	length = Integer.parseInt(in.readLine());
	
	System.out.print("Enter height of cube: ");
	height = Integer.parseInt(in.readLine());
	
	System.out.print("Enter width of cube: ");
	width = Integer.parseInt(in.readLine());
	
	volume = length* height* width;
	
	System.out.println("Volume of cube: "+ volume);
	}

}