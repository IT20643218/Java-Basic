package Ex_01;

//create account class and hold balance and acc number
public class Account {
	private double Balance;
	private int AccNo;
	
	//assigned account number
	public Account(int AccNo) {
		this.AccNo = AccNo;
	}
	
	//display account number
	public void displayAccNo() {
		System.out.println("Account No is :"+ AccNo);
	}
	
	//display existing balance
	public void displayBalance() {
		System.out.println("Balance is :" +Balance);
	}
	
	public double getBalance() {
		return Balance;
	}
	//Implement the deposit operation and that increases the existing balance in the account
	public void deposit(double amount) {
		Balance = Balance + amount;
		//Balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount <= Balance) {
			Balance = Balance - amount;
			//Balance -= amount;
		}else {
			throw new InsufficientBalanceException(Balance);
		}
	}
	
	 
}
