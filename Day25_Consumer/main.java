package Day25_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> orderList = new ArrayList<>();
		orderList.add("Laptop");
		
		List<String> orderList1 = new ArrayList<>();
		orderList1.add("Phone");
		orderList1.add("Speaker");
		
		List<String> orderList2 = new ArrayList<>();
		orderList2.add(null);
		
		

		
		List<Order> order = new ArrayList<>();
		order.add(new Order(101,"Alice",false,orderList));
		order.add(new Order(102,"Bob",true,orderList1));
		order.add(new Order(103,"Rod",true,orderList2));
		
		Consumer<Order> printProcess = processing("Customers :\r\n");
		Consumer<Order> printOrderDetails = orderDetails("Details : \r\n");
		Consumer<Order> combined = printProcess.andThen(printOrderDetails);

		
		Process(order,combined);
		

	}
	
	public static <T> void Process(List<T> word, Consumer<T> condition) {
		word.forEach(condition);
	}

	
	public static <T> Consumer<T> processing(String message) {
		String prefix = (message == null || message.isBlank()) ? "<Nothing>" : message;
		return s -> {
			if(s == null) System.out.println(prefix + " Null Value");
			else if(s instanceof Order s2) {
				String status = "Processed";
				if(s2.isProcessed() == true)
				System.out.println(prefix + "Order " + s2.getOrderID() + " for " + s2.getCustomerName() + " has been " + status);
				else System.out.println(prefix + "Order " + s2.getOrderID() + " for " + s2.getCustomerName() + " not " + status);
			}
		};
	}	
	
	public static <T> Consumer <T> orderDetails(String message) {
		String prefix = (message == null || message.isBlank()) ? "<Nothing>" : message;
		return s -> {
			if(s == null) System.out.print(prefix + "Null Value");
			else if (s instanceof Order s2 ) {
				System.out.print(prefix);
				s2.details();
				
			}
		};
	}
	

}
	