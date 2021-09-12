package Ex_01;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Account account = new Account(123);
		
		String cont ="yes";
		
		while (cont.equals("yes")) {
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.00);
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Please enter amount to be withdrawn = ");
		double amount = scanner.nextDouble();
		
		try {
			while(true) {
			System.out.println("\nWithdrawing Rs. " +amount +"/=");
			account.withdraw(amount);
			System.out.println("Existing amount = "+account.getBalance());

			}
			
		}catch (InsufficientBalanceException e) {
			System.out.println("Sorry ,your account remains only Rs."+e.getAmount());
			//e.printStackTrace();//this is optional ,if we want to print additional msg we can use this method
		}finally{
			System.out.println("Do you wish to countinue ? (yes/no)");
			cont = scanner.next();
		}
	  }
	}
}
