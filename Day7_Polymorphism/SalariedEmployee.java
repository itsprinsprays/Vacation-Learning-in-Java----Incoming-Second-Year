package Day7;
import Day1.print;
public class SalariedEmployee extends Employee{
	
	@Override
	double calculatePay() {
		print.pl("-----Salaried Employee-----");
		print.pl("Salary : " + 15000);
		return monthlySalary;
	}

}
