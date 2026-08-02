import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main1(String[] args) {

		Queue<String> q = new PriorityQueue<>();	
		q.offer("D");
		q.offer("K");
		q.offer("T");
		q.offer("E");
		
		while(!q.isEmpty())
		{
			String ele = q.poll();
			System.out.println(ele);
		}

	}
	public static void main(String[] args)
	{class StringDescComparator implements Comparator<String>{

		@Override
		public int compare(String x, String y) {
			int diff = y.compareTo(x); 
			return diff; 
		}
		
	}
	//(Elements are retrieved as per priority -- decided by given Comparator)
	Queue<String> q = new PriorityQueue<>(new StringDescComparator()); 
	q.offer("D");
	q.offer("K");
	q.offer("T");
	q.offer("E");
	
	while(!q.isEmpty()) {
		String ele = q.poll(); 
		System.out.println(ele);
	}
	}

}
