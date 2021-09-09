package Ex02;

import java.util.*;

public class MainEX {
	// Lab Sheet on Try Catch Blocks

	  public static void main(String[] args) {

	      int maxSubjects;
	      int [] marks = new int[5];
	      int total = 0;
	      double avg;
	      
	      try {
	      // 1. Input a value for maxSubjects
	      //    from keyboard
	     Scanner input = new Scanner(System.in);
	     
	     System.out.print("Enter Max Subject :");
	     int number = input.nextInt();
	      
	      // 2. Using a for loop 
	      //    input marks 
	     int max = number;
	     for (int i =0;i<5;i++) {
	    	 System.out.print("Enter Mark :"+(i+1)+":");
	    	 
	    	 number = input.nextInt();
	    	 total = total + number;
	     }
	     avg = total/5;
	     
	     System.out.println();
	     System.out.println("Total Mark :"+total);
	     
	      // 3. Calculate the avg marks
	      System.out.println("Avarage Mark :"+avg);
	      
	      // 4. Use a try catch block to
	      //    prevent the following 
	      //    run time errors
	      
	      //   (a) Input valid integers to the 
	      //         inputs
	      
	      
	      //   (b) ArithmeticException division
	      //        by zero
	      }catch(ArithmeticException e) {
	    	  System.out.println("Arithmetic Exception e");
	      //   (c) ArrayIndexOutOfBounds
	      //         Exception
	      }catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("Array Index Out Of Bounds Exception e");
	      
	      }catch (Exception e) {
	    	  System.out.println("Exception e");
	      }
	      
	      finally {
	         System.out.println("This code will be gurrentied to run");
	      }
	    
	      System.out.println("The end");

	  }
	
}
