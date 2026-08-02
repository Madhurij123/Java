import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_Interface_Class {

	public static void main1(String[] args) {

		List<Integer> v = new Vector<>();
		for(int i = 0; i < 10; i++)
			v.add(i);
		
		System.out.printf("Size:%d Capacity:%d\n",v.size(),((Vector<Integer>) v).capacity());
	    v.add(11);
		System.out.printf("Size:%d Capacity:%d\n",v.size(),((Vector<Integer>) v).capacity());
        //size : 11 capacity:20
	}
    public static void main2(String[] args)
    {
    	List<Integer> arr = new ArrayList<>();
    	for(int i = 0; i < 10; i++)
    		arr.add(i);
    	System.out.printf("Size:%d ",arr.size());
    	
    	arr.add(11);
    	System.out.printf("Size:%d ",arr.size());
    	
    		
    }
    public static void main(String[] args)
    {
    	List<Integer> arr = new ArrayList<>();
    	List<Integer> l = Collections.synchronizedList(arr);

    	
    		
    }
}
