import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Interface {

	public static void main(String[] args) {

		Queue<String> q = new ArrayDeque<>();
		
		//-------offer()/add()---------
		q.offer("D");
		q.offer("K");
		q.offer("T");
		q.offer("E");
		                                    //element()
		System.out.println("First Elememt:"+q.peek());
		
		while(!q.isEmpty())
		{
			String ele = q.poll();  //remove()
			System.out.println(ele);
		}
		System.out.println("Removing element from queue:"+q.poll());

	}

}
