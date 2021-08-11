/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */

public abstract class Account {
	String AccountNo;
	String Name;
	double Balance;
	
	public Account() {
		
	}
	
	public void Deposit(double amount) {
		this.Balance = this.Balance + amount;
	}
	
	//create constructor
	public Account (String AccountNo,String Name,double Balance) {
		this.AccountNo = AccountNo;
		this.Name = Name;
		this.Balance = Balance;
	}
	
	//abstract method
	abstract double calculateInterest(); 
	
	//implement display method
	public void display() {
		System.out.println("Account No :"+this.AccountNo);
		System.out.println("Name :"+this.Name);
		System.out.println("Balance :"+this.Balance);
		
		System.out.println("==================================");
	}

	public void withdraw(double d) {
		// TODO Auto-generated method stub
		
	}
}
