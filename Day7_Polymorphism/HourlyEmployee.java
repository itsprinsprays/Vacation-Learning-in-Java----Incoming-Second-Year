package Day7_Polymorphism;
import Day1_Methods.print;
import java.util.Scanner;
public class HourlyEmployee extends Employee {
	Scanner scan = new Scanner(System.in);
	
	Double hourlyRate, hourlyWorked;
	
    public HourlyEmployee() {
    	print.pl("-----Hourly Employee-----");
        System.out.print("Enter Hourly Rate: ");
        this.hourlyRate = scan.nextDouble();
        System.out.print("Enter Hours Worked: ");
        this.hourlyWorked = scan.nextDouble();
    }
    
	@Override
	double calculatePay() { 
		double salary =  hourlyRate * hourlyWorked;
		print.pl("Salary : " + salary);
		return salary;
	}

}
