import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class List_Integr {

	public static void main1(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Collections.addAll(list, 10, 20,30,40,50);
		
		Iterator<Integer> trav = list.iterator();
		while(trav.hasNext())
		{
			Integer ele = trav.next();
			System.out.println(ele);
			if(ele == 30)
				list.add(3, 100);  //Want to add  throw an exception
		}
	}
	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList(); //java.util.concurrent
		                                                 //Which not throw exception
		Collections.addAll(list, 10, 20,30,40,50);
		
		Iterator<Integer> trav = list.iterator();
		while(trav.hasNext())
		{
			Integer ele = trav.next();
			System.out.println(ele);
			if(ele == 30)
				list.add(3, 100);   			                                                 //Which not throw exception
	                         //Which not throw exception and does not add

		}
	}

}
