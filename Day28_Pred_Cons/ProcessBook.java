package Day28_Pred_Cons;

import java.util.List;
import java.util.function.*;

public class ProcessBook {
	 
	public static Predicate<Book> PublishedAfter() {
		return s-> s.getYearPublish() > 2010;
	}
	
	public static Predicate<Book> WrittenBy() {
		return s-> s.getAuthor().equals("Robert Martin");
	}
	
	public static Consumer<Book> printDetails() {
		return s-> {
			System.out.println("Title  : " + s.getTitle());
			System.out.println("Author : " + s.getAuthor());
			System.out.println("Year   : " + s.getYearPublish());
			System.out.println("-------------------------------------");

		};
	}
	
	public static void BookList(List<Book> list, Predicate<Book> condition1, Predicate<Book> condition2, Consumer<Book> action) {
		for(Book b : list) {
			if(condition1.and(condition2).test(b)) {
				action.accept(b);
			}
		}
	}

}
