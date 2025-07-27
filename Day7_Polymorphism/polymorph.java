package Day7;
import Day1.print;
import java.util.Scanner;
public class polymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		print.p("Enter Employee Type : Salary(1) Hourly(2) Commission(3) : ");
		int type = scan.nextInt();
		
		switch(type) {
		case 1 : 
			Employee emp = new SalariedEmployee();
			emp.calculatePay();
			break;
		case 2:
			emp = new HourlyEmployee();
			emp.calculatePay();
			break;
		case 3:
			emp = new CommissionEmployee();
			emp.calculatePay();
		}
		
		
	
		
		scan.close();
	}

}
