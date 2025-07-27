package Day8_Abstraction;
import Day1_Methods.print;
public class FixedDepositAccount extends BankAccount{
	
	int years;
	
	FixedDepositAccount() {
		super.ask();
		print.p("Enter Years : " );
		this.years = scan.nextInt();
	}
	
	double calculateInterest() {
		interest = balance * 0.08 * years;
		netpay = balance + interest;
		return 0.0;
	}
	
	@Override
	void accountdetails() {
		super.accountdetails();
		print.pl("Interest   : " + interest);
		print.p("Net Pay    : " + netpay);
	}

}
