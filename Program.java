import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
	
	public static int menuList()
	{
		int ch;
		System.out.println("0.Exit");
		System.out.println("1.Add New Book In list");
		System.out.println("2.Display all BOOK in Forward Order");
		System.out.println("3.Display all BOOK in Revers Order");
		System.out.println("4.Delete a Book at given index");
		System.out.println("5.Sort all book by Price in desending order");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice:");
		ch = sc.nextInt();
		return ch;

	}

	public static void main(String[] args) {

		//Book[]  b = new Book[5];
		
	    List<Book> list = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		int count = 0;
		
		while((ch = menuList())!= 0)
		{
			switch(ch)
			{
			case 1:
				System.out.println("--------Book Management System---------------------");
				System.out.print("Enter a No.of Books want to add:");
				int n = sc.nextInt();
				System.out.println("---------------------------------------------------");
				for(int i = 0; i < n; i++)
				{
					Book b = new Book();
					b.accept();
					list.add(b);
					System.out.println("New Book Added Successfully..!!");
					System.out.println("---------------------------------------------------");

				}
				break;
				
			case 2:
				Iterator<Book> trav = list.iterator();
				while(trav.hasNext())
				{
					Book e = trav.next();
					System.out.println(e);
					System.out.println("---------------------------------------------------");
				}
				System.out.println();
				break;
				
			case 3:
				ListIterator<Book> trav1 = list.listIterator(list.size());

			    while (trav1.hasPrevious()) {
			        Book b = trav1.previous();
			        System.out.println(b);
					System.out.println("---------------------------------------------------");
			    }
			    System.out.println();
			    break;
			    
			case 4:
				System.out.println("Enter Id WANT TO Delete:");
				int key = sc.nextInt();
				list.remove(key);
				System.out.println("Book Deleted Succsfully..!!");
				break;
				
			case 5:
				Collections.sort(list);
				for(Book bk : list)
				{
					System.out.println(bk);
					System.out.println("---------------------------------------------------");
				}
				break;
				
			default:
				System.out.println("Invalid Choice...!!");
				
			}
		}
		
		
	}

}
