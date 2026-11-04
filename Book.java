import java.util.Scanner;

public class Book implements Comparable<Book> {
	private int id;
	private int quantity;
	private String authorName;
	private double price;
	
	public Book()
	{
		
	}
	public Book(int id, int quantity, String authorName, double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.authorName = authorName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public  void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a book id");
		id = sc.nextInt();
		System.out.println("Enter a quantity:");
		quantity = sc.nextInt();
		System.out.println("Enter a Author name:");
		authorName = sc.next();
		System.out.println("Enter a Price:");
		price = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", quantity=" + quantity + ", authorName=" + authorName + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book other) {
		int diff = (int) (other.price - this.price);
		return diff;
	}
	
	

}
