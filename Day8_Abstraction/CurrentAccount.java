package Day8;
import Day1.print;

public class CurrentAccount extends BankAccount{
	
	
	CurrentAccount() {
		super.ask();
	}
	
	double calculateInterest() {
		
		return 0.0;
	}
	
	@Override
	void accountdetails() {
		super.accountdetails();
		print.p("Interest   : 0");
	}
	
	
	
	

}
