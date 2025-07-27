package Day9_OOP;

public class CreditCard implements PaymentMethod{
	
		@Override
	    public double pay(double amount) {
			System.out.println("Paid " + amount + " by Credit Card");
			return 5.0;
		}

}
