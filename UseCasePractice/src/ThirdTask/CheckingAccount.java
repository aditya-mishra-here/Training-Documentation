package ThirdTask;

public class CheckingAccount extends BankAccount{

	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Checking Account deposit done for amount : "+ amount);
		balance+=amount;
		
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance+overdraftLimit) {
			System.out.println("Checking Account withdraw done for amount : "+ amount);
			balance-=amount;
		}
		else {
			System.out.println("Balance not sufficient in checking account!! ");
		}
		
	}
	
	

}
