package Day35_Stream_ThreeReferenceMethod;

public class processProduct {
	
	public Product applyDiscount(Product p) {
		double reduces = p.getPrice() - (p.getPrice() * 0.10) ;
		p.setPrice(reduces);
		return p;
	}
	
	public boolean isFilter(Product p) {
		return p.getPrice() <= 1000;
	}
	
	public static Product capitalizeName(Product p) {
	    p.setName(p.getName().substring(0,1).toUpperCase() + 
	              p.getName().substring(1).toLowerCase());
	    return p; 
	}


}
