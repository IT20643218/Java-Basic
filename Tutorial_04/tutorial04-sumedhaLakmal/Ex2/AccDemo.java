/*
 * B.M.S.L.Bandaranyaka 
 * IT 20643218
 * 
 */
public class AccDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob1 = new FixdDepositAccount("Ac058794213","Sumedha Lakal",25000.00);
		
		ob1.Deposit(20000.00);
		ob1.display();
		
		Account on2 = new SavingAccount("IT20643218","B.M.S.L.Bandaranayaka",10000.00);
		
		on2.Deposit(10000.00);
		on2.withdraw(250.00);
		
		on2.display();
	}

}
