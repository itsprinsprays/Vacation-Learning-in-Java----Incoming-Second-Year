package Day28_Pred_Cons;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = Arrays.asList(
			    new Book("Clean Code", "Robert Martin", 2008),
			    new Book("Clean Coder", "Robert Martin", 2011),
			    new Book("Effective Java", "Joshua Bloch", 2018),
			    new Book("Java Concurrency in Practice", "Brian Goetz", 2006),
			    new Book("Clean Architecture", "Robert Martin", 2017),
			    new Book("Head First Java", "Kathy Sierra", 2005)
			);
		
		Predicate<Book> PublishAfter = ProcessBook.PublishedAfter();
		Predicate<Book> WriitenBy = ProcessBook.WrittenBy();
		Consumer<Book> PrintDetails = ProcessBook.printDetails();
		
		ProcessBook.BookList(books, PublishAfter, WriitenBy, PrintDetails);
	}

}
