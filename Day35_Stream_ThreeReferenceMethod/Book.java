package Day35_Stream_ThreeReferenceMethod;

public class Book {
	
	private String title;
	private int year;
	
	public Book(String title) {
			this.title = title;
			this.year = (int)(Math.random() * (2025 - 2000 +1) + 2000);
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return getTitle() + " (" + getYear() + ")";
	}

}
