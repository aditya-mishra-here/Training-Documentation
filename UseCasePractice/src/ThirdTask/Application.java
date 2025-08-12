package ThirdTask;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		SavingsAccount sav = new SavingsAccount("21BAI1248", 10000);
		sav.setInterestRate(5);
		
		CheckingAccount che = new CheckingAccount("29282939", 30000);
		che.setOverdraftLimit(20000);
		
		accounts.add(sav);
		accounts.add(che);
		

		for (BankAccount account : accounts) {
            account.deposit(200);
            account.withdraw(300);
            account.getBalance();

            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                sa.applyInterest();
                sa.getBalance();
            }
        }

	}

}
