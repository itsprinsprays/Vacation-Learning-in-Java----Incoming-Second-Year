package Day8;
import Day1.print;

public class SavingsAccount extends BankAccount {
	
	
	
	SavingsAccount() {
		super.ask();
	}

	double calculateInterest() {
		interest = balance * 0.05;
		netpay = interest + balance;
		return netpay;
	}
	
	@Override
	void accountdetails() {
		 super.accountdetails();
		 print.pl("Interest   : " + interest);
		 print.pl("Net Pay    : " + netpay);
	}
	

}
