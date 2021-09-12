package Ex_01;

//Customer Exception class
public class InsufficientBalanceException extends Exception {
	double amount;//pass amount to the class
	
	public InsufficientBalanceException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
