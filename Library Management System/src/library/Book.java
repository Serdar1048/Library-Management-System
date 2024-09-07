package library;

public class Book {

	private String name, author, publisher, adress, status;
	private int qty, brwcopies; // qty--> copies for sale - brwcopies--> copies for borrowing
	private double price;

	public Book(String name, String author, String publisher, String adress, int qty, int brwcopies, double price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.adress = adress;
		this.qty = qty;
		this.brwcopies = brwcopies;
		this.price = price;
	}

	public Book() {
	}

	@Override
	public String toString() {
		String text = "Book Name: " + name + "\nBook Author: " + author + "\nBook Publisher: " + publisher
				+ "\nBook Collection Adress: " + adress + "\nQty: " + String.valueOf(qty) + "\nPrice: "
				+ String.valueOf(price) + "\nBorrowing Copies: " + String.valueOf(brwcopies);
		return text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getBrwcopies() {
		return brwcopies;
	}

	public void setBrwcopies(int brwcopies) {
		this.brwcopies = brwcopies;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString2() {
		String text = name + "<N/>" + author + "<N/>" + publisher + "<N/>" + adress + "<N/>" + String.valueOf(qty)
				+ "<N/>" + String.valueOf(price) + "<N/>" + String.valueOf(brwcopies);
		return text;
	}

	
}
