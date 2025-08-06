package Day25_Consumer;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderID;
	private String customerName;
	private boolean processed;
	private List<String> items;
	
	Order(int orderID, String customerName, boolean processed, List<String> items) {
			this.orderID = orderID;
			this.customerName = customerName;
			this.processed = processed;
			this.items = new ArrayList<>(items);

	}
	
	Order() {
		
	}
	public void details() {
		System.out.println("Order ID : " + orderID + " | Costumer : " + customerName + "\r\n" + "Items :" );
		
		if(items.isEmpty() || items == null) System.out.println("No Items in Order");
		else {
			 for (String item : items) {
		            System.out.println(" - " + item);
		        }
		}
	    if(processed == false) System.out.println("Status : " + "Not Processed");
	    else System.out.println("Status : " + " Processed");
		
	    System.out.println("");

    }
	
	
	int getOrderID() {
		return orderID;
	}
	
	String getCustomerName() {
		return customerName;
	}
	
	boolean isProcessed() {
		return processed;
	}
	
	List<String> getItems() {
		return new ArrayList<>(items);
	}
	
	void setOrderId(int orderID) {
		this.orderID = orderID;
	}
	
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	void setProcessed(boolean processed) {
		this.processed = processed;
	}
	
	void setItems(List<String> items) {
		this.items = items;
	}
	
	

}
