package Day35_Stream_ThreeReferenceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<String> productNames = Arrays.asList("laptop", "mouse", "keyboard", "monitor");
		
		  processProduct processor = new processProduct();
		
		List<Product> newProductNames = productNames.stream()
												.map(Product::new)
												.map(processProduct::capitalizeName)
												.map(processor::applyDiscount)
												.filter(processor::isFilter)
												.collect(Collectors.toList());
		
		newProductNames.forEach(System.out::println);
											
		
		

	}
	


}
