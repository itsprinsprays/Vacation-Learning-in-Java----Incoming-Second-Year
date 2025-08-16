package Day35_Stream_ThreeReferenceMethod;

public class processBook {
	
	public static Book capitalizeTitle(Book b) {
		b.setTitle(b.getTitle().substring(0,1).toUpperCase() + b.getTitle().substring(1).toLowerCase());
		return b;
	}
	
	public boolean isYear(Book b) {
		return b.getYear() >= 2010;
	}

}
