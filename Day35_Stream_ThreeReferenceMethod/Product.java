package Day35_Stream_ThreeReferenceMethod;

public class Product {
	
	private  String name;
	private double price;
	
	public Product(String name) {
		this.name = name;
		this.price = (int)(Math.random() * (2000 - 500 + 1 ) + 500);
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product : " +  getName() + ", Price : " + getPrice();
	}
	

}
