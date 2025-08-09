package Day28_Pred_Cons;

public class Book {
	
	private String title,author;
	private int yearPublish;
	
	public Book(String title, String author, int yearPublish) {
		this.title = title;
		this.author = author;
		this.yearPublish = yearPublish;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
	
	int getYearPublish() {
		return yearPublish;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

}
