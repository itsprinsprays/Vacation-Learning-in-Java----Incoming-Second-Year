package Day8_Abstraction;
import Day1_Methods.print;
import java.util.Scanner;


public abstract class BankAccount {
	
	 double balance,interest,netpay;
	 int account;
	 Scanner scan = new Scanner(System.in);
	
	 abstract double calculateInterest();

	 
	 void accountdetails() {
		 print.pl("Account No : " + account);
		 print.pl("Balance    : " + balance);
	 }
	 
	 void ask() {
		 print.p("Enter Account Number : ");
		this.account = scan.nextInt();
			
		 print.p("Enter Balance        : ");
		this.balance = scan.nextDouble();
	 }

}
