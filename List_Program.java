import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List_Program {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		//----------1.add()---------
		list.add("Madhuri");
		list.add("Mahek");
		list.add("Shubhangi");
		list.add("Priti");
		list.add("Swarda");
		list.add("Kavita");
		list.add("Sharavni");
		list.add("Nilam");
		list.add("Amruta");
		
		//----------2.size()---------
		System.out.println("Size:"+list.size());
	
		//----------3.toString()-------
		System.out.println("toString():"+list.toString());
		
		list.add(7, "Pooja");
		System.out.println("After add():"+list.toString());
		
		//------------4.get()-----------
		//list.get(5);
		System.out.println("get():"+list.get(5));
		
		//------------5.set()----------
		int index = 8;
		list.set(index, "Akanasha");
		System.out.println("set():"+list.toString());

       //-------------6.Uppercase()-----
        String e =list.get(1);
		System.out.println("Upper case:"+e.toLowerCase());
		
	  //-------------7.remove()--------
		list.remove(8);
		System.out.println("remove():"+list.toString());
		
	//--------------8.contains()-------
		String s = "Priti";
		boolean found = list.contains(s);
		if(found)
			System.out.println("contains():"+s+" found");
		else
			System.out.println("Not found");
		
	//--------------9.indexOf() /lastIndex()------
		int index1 = list.indexOf(s);
		if(index1 != -1)
			System.out.println("Element found at:"+index1);
		else
			System.out.println("Not Found");

   //----------------10.clear()--------
		//list.clear();
		
	//----------------11.iterator()---itrable interface---call iterator
		Iterator<String> trav = list.iterator();
		while(trav.hasNext())  //checks pointing to valid elements or null
		{
			String ele = trav.next();  //return current ele and points to next element
			System.out.println("Element:"+ele);
		}
		System.out.println();

			
	//---------------12.Collections.addAll()------
		//-----------Collections is a helper classs---
		Collections.addAll(list, "Rohan","Nitin","Amar","Sagar","Prashant");
        System.out.println("Collections addll():"+list.toString());
        
     //---------------13.Collections.sort() +++++Comparable pre-defined string interface--------
        Collections.sort(list);
        System.out.println("Collections sort():"+list.toString());
        
      //-------------14.Collections.shuffule()---
        Collections.shuffle(list);
        System.out.println("Collections sort():"+list.toString());
        
      //------------15.StringComparator------------
        class StringComparator implements Comparator<String>
        {

		@Override
		public int compare(String x, String y) {
			int diff = x.compareTo(y);
			return diff;
		}
        	
        }
        Collections.sort(list, new StringComparator());
        System.out.println("StringComparator:"+list.toString());
        

	}

}
