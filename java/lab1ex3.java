import java.util.Scanner;
public class lab1ex3{
	public static void main(String[] args){
	Scanner ob=new Scanner(System.in);
	System.out.print("Please Enter your age :");
	int age =ob.nextInt();
	if (age >18){
		System.out.println("Adult");
	}else{
		System.out.println("Child");
	}
}
}