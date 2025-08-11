package ThirdTask;

public abstract class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	abstract void deposit(double amount);
	
	abstract void withdraw(double amount);
	
	public void getBalance() {
		System.out.println("Current Balance is : "+balance);
	}
	
}
