package Day28_Pred_Cons;

import java.util.List;
import java.util.function.*;

public class ProcessProduct {
	
	//Predicate
	
	public static Predicate<Product> isGreater() {
		return s-> s.getPrice() > 500;
	}
	
	public static Predicate<Product> isLess() {
		return s-> s.getStock() < 20;
	}
	
//	public static Predicate<Product> isSensitive() {
//		return s-> s.getName().toLowerCase().contains("pro");
//	}
	
	//Consumer
	
	public static Consumer<Product> productUpperCase() {
		return s-> System.out.println("Product Name  : " + s.getName().toUpperCase());
	}
	
	public static Consumer<Product> productPrice() {
		return s-> System.out.println("Product Price : " + s.getPrice());
	}
	
	public static Consumer<Product> productStock() {
		return s-> System.out.println("Product Stock : " + s.getStock() + " \n");
	}
	
	//Chained/Combined Methods 
	public static Predicate<Product> combinedPredicate(){
		return isGreater().and(isLess()).or(p-> p.getName().toLowerCase().contains("pro"));
	}
	
	public static Consumer<Product> chainedConsumer(){
		return productUpperCase().andThen(productPrice().andThen(productStock()));
	}
	
	public static void productCombined(List<Product> list, Predicate<Product> condition, Consumer<Product> action) {
		for(Product p : list) {
			if(condition.negate().test(p)) {
				action.accept(p);
			}
		}
	}

}
