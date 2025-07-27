package Day7_Polymorphism;
import Day1_Methods.print;
public class SalariedEmployee extends Employee{
	
	@Override
	double calculatePay() {
		print.pl("-----Salaried Employee-----");
		print.pl("Salary : " + 15000);
		return monthlySalary;
	}

}
