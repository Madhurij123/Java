import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {

		//Set<Book> set = new HashSet<>();
		Set<Book> set = new LinkedHashSet<>();
		//Set<Book> set = new TreeSet<>();
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		System.out.println("Set:");
		for(Book b : set)
		{
			System.out.println(b);
		}
		
		class BookIdComparator implements Comparator<Book>
		{
			@Override
			public int compare(Book x, Book y) {
				int diff = Integer.compare(x.getId(), y.getId());
				return diff;
			}	
		}
		System.out.println("Set:");
		for(Book b : set)
		{
			System.out.println(b);
		}
		

	}
}
	
	/*public static void main(String[] args)
	{
		class BookIdComparator implements Comparator<Book>
		{

			@Override
			public int compare(Book x, Book y) {
				int diff = Integer.compare(x.getId(), y.getId());
				return diff;
			}	
		}
		//Collections.sort(set, new BookIdComparator());
		Set<Book> set = new TreeSet<>(new BookIdComparator());
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		System.out.println("Set:");
		for(Book b : set)
		{
			System.out.println(b);
		}
	}*/


