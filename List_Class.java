import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Class {

	public static void main(String[] args) {

		//List<Integer> list = new ArrayList<>();
		//List<Integer> list = new LinkedList<>();
		List<Integer> list = new Vector<>();
		
		
		Collections.addAll(list, 10, 20, 30, 40, 50);
		
		System.out.println("for-each loop (Since Java 1.2) ( works for all Collections) ");
         for(Integer a : list)
         {
        	 System.out.println(a);
         }
         
 		System.out.println("Using Iterator (Since Java 1.2) ( works for all Collections) (list)");
        Iterator<Integer> trav = list.iterator();
        while(trav.hasNext())
        {
        	Integer ele = trav.next();
        	System.out.println(ele);
        }
        System.out.println();
        
		System.out.println("For loop(works for all List) ");
        for(int i = 0 ; i < list.size(); i++)
        {
        	Integer ele = list.get(i);
        	System.out.println(ele);
        }
		System.out.println("Enumeration can work only with vector ");
		Enumeration<Integer> en = ((Vector<Integer>) list).elements();
		while(en.hasMoreElements()) {
			Integer ele = en.nextElement(); 
			System.out.println(ele);
		}
		
	}

}
