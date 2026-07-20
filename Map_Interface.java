import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map_Interface {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		
		//Duplicate key not allowed but value allowed
		//same key--- override old value
		
		//------------------1.put()---------
		map.put(415110, "Karad - Satara"); 
		map.put(411052, "Hinjawadi - Pune"); 
		map.put(411046, "Katraj - Pune"); 
		map.put(400027, "Byculla - Mumbai"); 
		map.put(411002, "Bajirao Rd - Pune"); 
		map.put(411037, "Marketyard - Pune");
		map.put(411007, "Aundh - Pune"); 
		map.put(411052, "HINJEWADI - Pune"); 
		
		//----------------2.size()----------
		System.out.println("MAP:"+map.size());
		
		//----------------3.get()-----------
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id:");
		int a = sc.nextInt();*/
		//String area = map.get(a);
		
		//----------------4.getOrDefault()-------
		//String area = map.getOrDefault(a, "not available");
		//System.out.println("Area:"+area);
		
		//----------------5.keySet()---------
		/*Set<Integer> key = map.keySet();
		for(Integer k : key)
		{
			System.out.println(k);
		}
		
		Collection<String> values = map.values();
		for(String ele : values)
		{
			System.out.println(ele);
		}*/ 
		
		Set<Entry<Integer,String>> ent = map.entrySet();
		for(Entry<Integer, String> en : ent)
		{
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.println(key+"----"+value);
		}
		
	}
}
