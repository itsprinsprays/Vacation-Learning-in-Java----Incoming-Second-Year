package Day9_InterfaceAbstraction;

interface say {
	void sayHello();
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Polymorphic Statement
		PaymentMethod cc = new CreditCard();
		PaymentMethod  gc = new Gcash();
		
		double deduction =  cc.pay(200.0);
		System.out.println("Deduction : " + deduction);
		
		deduction =  gc.pay(500.0);
		System.out.println("Deduction : " + deduction);

		
		//Lambda Expression
		PaymentMethod paypal = (amount)-> {
			System.out.println("Paid " + amount + " by Paypal");
			return 10.0;
		};
		deduction = paypal.pay(400);
		System.out.println("Deduction : " + deduction);
		
		say s = () -> System.out.print("hello");
		s.sayHello();
		
	}

}

			
