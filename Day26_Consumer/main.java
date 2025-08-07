package Day26_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Product> productInfo = new ArrayList<>(Arrays.asList(
				new Product("MacBook Air",2,55000),
				new Product("Wireless Mouse", 15 , 550),
				new Product("Monitor" , 3, 6500),
				new Product("USB Cable", 1, 150),
				new Product("Smartphone", 4, 12000)
				));
		Consumer<Product> prod = Product.safePrinting();
		Consumer<Product> restock = Product.restockIfLow();
		Consumer<Product> mark = Product.markExpensive();
		Consumer<Product> sold = Product.sold();
		Consumer<Product> combined = prod.andThen(restock).andThen(mark).andThen(sold);
		
		Product.printproduct(productInfo, combined);

	}

}
