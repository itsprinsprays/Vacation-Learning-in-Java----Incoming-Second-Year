package Day8;
import java.util.Scanner;

import Day1.print;
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
