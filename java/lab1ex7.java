import java.util.Scanner;

public class lab1ex7{
	public static void main(String[] args){
	
		
	Scanner a=new Scanner(System.in);
	
	System.out.print("Enter Number 1:");
	int num1=a.nextInt();
	
	System.out.print("Enter Number 2:");
	int num2=a.nextInt();
	
	int sum=num1+num2;
	int avarage=num1/num2;
	
	System.out.println("Sum :"+sum+"\n");
	System.out.println("Avarage :"+avarage+"\n");
	}

}

/*
import java.text.DecimalFormat;
 
public class DecimalFormatMain {
 
    public static void main(String[] args) {
        double d=2343.5476;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Rounded double (DecimalFormat) : " + df.format(d));
    }
 
}*/