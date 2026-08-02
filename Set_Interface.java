import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
     
		
		//if elements is already present ----return false;
		//set remain unchange
		
		//Set<String> set = new HashSet<>();
	    Set<String>	set = new LinkedHashSet<>();
	    //Set<String>	set = new TreeSet<>();
       
	    set.add("India"); // return true 
		set.add("USA");// return true
		set.add("France");// return true
		set.add("Japan");// return true
		set.add("India");// return false "Already exist"
		set.add("Mexico");// return true
		set.add("USA");// return false "Already Exist" 
		set.add("Japan");// return false "Already Exist"
		
		System.out.println("Size:"+set.size());
		
		for(String ele : set)
		{
			System.out.println(ele.toString());
		}
		
	}

}
