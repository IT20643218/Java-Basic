/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */
public class FixdDepositAccount extends Account {
	
	public FixdDepositAccount() {
		
	}
	public FixdDepositAccount(String AccountNo, String Name, double Balance) {
		super(AccountNo, Name, Balance);
		// TODO Auto-generated constructor stub
	}

	double InterestRate;
	double Interest;
	
	public void setInterestRate(double InterestRate) {
		this.InterestRate = InterestRate;
	}
	
	public double getInterestRate() {
		return InterestRate;
	}
	
	public double CalculateInterest() {
		Interest = Balance * InterestRate/100;
		return Interest;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
