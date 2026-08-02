import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	//Deque as Stack
	public static void main1(String[] args) {

		Deque<Integer> d = new ArrayDeque<>();
		d.offerFirst(10);
		d.offerFirst(20);
		d.offerFirst(20);
		d.offerFirst(40);
		
		while(!d.isEmpty())
		{
			Integer e = d.pollFirst(); //<> wrapper assign
			System.out.println(e);
		}
		
	}
	//Deque as Queue
	public static void main(String[] args) {

		Deque<Integer> d = new ArrayDeque<>();
	    d.addLast(10);
	    d.addLast(20);
	    d.addLast(30);
	    d.addLast(40);

		
		while(!d.isEmpty())
		{                    //use pollFist() also for queue
			Integer e = d.pollFirst(); //<> wrapper assign
			System.out.println(e);
		}
		
	}

}
