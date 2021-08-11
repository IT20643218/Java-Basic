/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */
public  class SavingAccount extends FixdDepositAccount{

	public SavingAccount() {
		
	}
	public SavingAccount(String AccountNo, String Name, double Balance) {
		super(AccountNo, Name, Balance);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double amount) {
		Balance = Balance - amount;
	}
	
	public double CalculateInterest() {
		Interest = Balance * InterestRate/100/12;
		return Interest;
	}

}
