package in.conceptarchitect.banking;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accountNumber, String name, String password, double amount) {
		super(accountNumber, name, password, amount);
		// TODO Auto-generated constructor stub
	}

	public int getMinBalance() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public BankingStatus withdraw(double amount, String password) {
		if(amount>getBalance()-getMinBalance())
			return BankingStatus.insufficientBalance;
		else
			return super.withdraw(amount, password);
		
	}
	
}
