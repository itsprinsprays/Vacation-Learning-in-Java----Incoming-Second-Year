package Day36_StreamAddToolkit;

import java.util.Objects;

public class Book {
	
	private String title;
	private int rating;
	
	public Book(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}
	
	public String getTitle() {return title; }
	public int getRating() {return rating; }
	
	public static Book from(String s) {
		String[] p = s.split(", ");
		return new Book(p[0], Integer.parseInt(p[1]));
	}
	
	public static boolean isRating(Book b) {
		return b.getRating() >= 4;
	}
	
	public static int compare(Book b1, Book b2) {
		int com = Integer.compare(b1.getRating(), b2.getRating());
		if(com == 0) {
			return b1.getTitle().compareTo(b2.getTitle());
		}
		return com;
	}
	
	public String toString() {
		 return getTitle() + " (Rating: " + getRating() + ")";
	}
	

}
