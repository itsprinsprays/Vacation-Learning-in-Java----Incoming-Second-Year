package Day7_Polymorphism;
import Day1_Methods.print;
import java.util.Scanner;

public class CommissionEmployee extends Employee{
	
	Scanner scan = new Scanner(System.in);
	double baseSalary, sales, commissionRate;
	
	CommissionEmployee() {
		print.pl("-----Commission Employee-----");
		print.p("Enter Base Salary : ");
		this.baseSalary = scan.nextDouble();
		
		print.p("Enter Sales : ");
		this.sales = scan.nextDouble();
		
		print.p("Enter CommissionRate : ");
		this.commissionRate = scan.nextDouble();
	}
	
	@Override
	double calculatePay() {
		Double commission = commissionRate * sales;
		print.pl("Total Commission : " + commission);
		Double Salary = commission + baseSalary;
		print.p("Salary : " + Salary);
		return Salary;
	}

}
