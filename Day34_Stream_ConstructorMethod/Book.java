package Day34_Stream_ConstructorMethod;

public class Book {
	
	private final String title;
	private final int pages;
	
	public Book(String title) {
		this.title = title;
        this.pages = (int)(Math.random() * 500) + 100; 
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	@Override
	public String toString() {
		return getTitle() + getPages();
	}

}
