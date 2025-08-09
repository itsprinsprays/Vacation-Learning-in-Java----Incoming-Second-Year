package Day28_Pred_Cons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>(Arrays.asList(
				 	new Product("ProPhone X", 1200, 15),
				    new Product("BasicPhone", 300, 50),
				    new Product("ProLaptop", 2000, 10),
				    new Product("Headphones", 800, 5),
				    new Product("Mouse", 150, 25),
				    new Product("ProTablet", 900, 18),
				    new Product("Charger", 100, 30)
				));

		
		
		ProcessProduct.productCombined(products, ProcessProduct.combinedPredicate(), ProcessProduct.chainedConsumer());

	}

}
