package Day9_OOP;

public class Gcash implements PaymentMethod{
	
	@Override
	public double pay(double amount) {
		System.out.println("Paid " + amount + " by Gcash");
		return 8.0;
	}
 
	
}
