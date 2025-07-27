package Day8;
import Day1.print;
import java.util.Scanner;
public class Abstrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		print.p("Choose Account Type: Savings(1), Current(2), Fixed Deposit(3): ");
		int type = scan.nextInt();
		
		switch(type) {
		case 1:
			BankAccount a = new SavingsAccount();
			a.calculateInterest();
			a.accountdetails();
			break;
		case 2:
			a = new CurrentAccount();
			a.calculateInterest();
			a.accountdetails();
			break;
		case 3:
			a = new FixedDepositAccount();
			a.calculateInterest();
			a.accountdetails();
		}
		
		scan.close();

	}

}
