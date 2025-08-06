package Day25_Consumer;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderID;
	private String costumerName;
	private boolean processed;
	private List<String> items;
	
	Order(int orderID, String costumerName, boolean processed, List<String> items) {
			this.orderID = orderID;
			this.costumerName = costumerName;
			this.processed = processed;
			this.items = new ArrayList<>(items);

	}
	
	Order() {
		
	}
	public void details() {
		System.out.println("Order ID : " + orderID + " | Costumer : " + costumerName + "\r\n" + "Items :" );
	    for (String item : items) {
            System.out.println(" - " + item);
        }
//	    if(processed == false) {
//	    	System.out.print("Status : " + "Not Processed");
//	    } else System.out.print("Status : " + " Processed");
		

    }
	
	
	int getOrderID() {
		return orderID;
	}
	
	String getCostumerName() {
		return costumerName;
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
	
	void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}
	
	void setProcessed(boolean processed) {
		this.processed = processed;
	}
	
	void setItems(List<String> items) {
		this.items = items;
	}
	
	

}
