package ThirdTask;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	void deposit(double amount){
		System.out.println("Savings Account deposit done for amount : "+ amount);
		balance+=amount;
	}
	
	public void applyInterest() {
		double interest = (interestRate*balance)/100;
		System.out.println("Interest is : "+interest);
		balance+=interest;
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance) {
			System.out.println("Savings Account withdraw done for amount : "+ amount);
			balance-=amount;
		}
		else {
			System.out.println("Balance not sufficient for savings account !! ");
		}
	}
}
