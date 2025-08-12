package FifthTask;

public class Book extends Product{
	
	public Book(String productid, String name) {
		super(productid, name);
	}

	String author;
	


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", Author: " + author;
	}

}

