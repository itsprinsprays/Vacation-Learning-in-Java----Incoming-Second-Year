package Day33_Stream_InstanceMethod;

public class Product {

    private final String name;
    private final double price;
    private final String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public boolean isPriced() {
    	return this.price >= 5000;
    }

    public Product capitalizeName() {
        return new Product(name.toUpperCase(),price,category);
    }

    public Product applyDiscount(double percent) {
    	double discountedPrice = price - (price * percent / 100);
        return new Product(name, discountedPrice , category);
    }

    @Override
    public String toString() {
        return name + " - " + price + " (" + category + ")";
    }
}
