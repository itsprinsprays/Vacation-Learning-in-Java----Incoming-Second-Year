package Day28_Pred_Cons;

public class Book {
	
	private String title,author;
	private int yearPublish;
	
	public Book(String title, String author, int yearPublish) {
		this.title = title;
		this.author = author;
		this.yearPublish = yearPublish;
	}
	
	public String getTitle() {
		return title;
	}
	
	public	String getAuthor() {
		return author;
	}
	
	public int getYearPublish() {
		return yearPublish;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

}
