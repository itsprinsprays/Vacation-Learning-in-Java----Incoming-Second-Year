package Day26_Consumer;

import java.util.List;
import java.util.function.Consumer;

public class Product {
	
	private String name;
	private int quantity,price;
	
	public Product(String name,int quantity,int price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public static <T>void printproduct(List<T> word, Consumer<T> consumer) {
		word.forEach(consumer);
	}
	
	public static <T> Consumer <T> safePrinting() {
		return s -> {
			if(s == null) System.out.print("Null Value");
			else if(s instanceof Product p) {
				System.out.println("Product : " + p.getName());
				System.out.println("Quantity : " + p.getQuantity());
				System.out.println("Price : " + p.getPrice());
			}
		};
	}
	
	public static <T> Consumer <T> restockIfLow() {
		return s-> {
			if(s instanceof Product p) {
				if(p.getQuantity() <5) {
					p.setQuantity(p.getQuantity() + 10);
					System.out.println("[Restocked to " + p.getQuantity() + "]");
					
				}	
			}
		};
	}
	
	public static <T> Consumer<T> sold() {
		return s-> {
			if(s instanceof Product p) {
				if(p.getQuantity() <5) {
					p.setQuantity(p.getQuantity() + 10);
		
				} 
				
				p.setQuantity(p.getQuantity() - 1);
				System.out.println("[Sold 1 Unit - New Quantity : " + p.getQuantity() + "]");
			}
			System.out.println("----------------------------");
			System.out.println("");
			
		};
	}
	
	public static <T> Consumer <T> markExpensive() {
		return s-> {
			if(s instanceof Product p) {
				if(p.getPrice() > 1000) {
					System.out.println("[High Value Item]");
				}
			}
		};
	}
	
	String getName() {
		return name;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	int getPrice() {
		return price;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void setPrice(int price) {
		this.price = price;
	}

}
