package Day9_OOP;

@FunctionalInterface
public interface PaymentMethod { //if the interface only has 1 abstract method then it is a Functional Interface

	double pay(double amount); 
	
}
