package clg.dkte;
import java.util.*;
public class Book{

	private int bookId;
	private String title;
	private String author;
	private Date joining;  //Association
	
	public Book()
	{
		System.out.println("public Book()");
		joining = new Date();

	}

	public Book(int bookId, String title, String author, Date joining) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.joining = joining;
	}
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getJoining() {
		return joining;
	}

	public void setJoining(Date joining) {
		this.joining = joining;
	}

	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Book id:");
		bookId = sc.nextInt();
		System.out.println("Enter a titile:");
		title = sc.next();
		
		System.out.println("Enter a author:");
		author = sc.next();
		this.joining.acceptDate();
	}
	public void display()
	{
		System.out.println("Book Id:"+bookId);
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
        this.joining.display();		
	}

	public int getYear() {
		Date.getYear();
		return 0;
	}


	
}
