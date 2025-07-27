package Day8_Abstraction;
import Day1_Methods.print;

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
