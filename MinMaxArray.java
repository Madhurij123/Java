package dsa1.array;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxArray {

   public static  ArrayList<Integer> findMinMax(int[] arr){
	   
	   ArrayList<Integer> sortedList = new ArrayList<Integer>();
	   for(int n : arr) {
		   sortedList.add(n);
	   }
	   
	   Collections.sort(sortedList);
	   
	   ArrayList<Integer> res = new ArrayList<Integer>();
	   
	   res.add(sortedList.get(0));
	   res.add(sortedList.get(sortedList.size() - 1));
	   return res;
   }
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4,5 };
		
		ArrayList<Integer> res = findMinMax(arr);
		System.out.println("Minimum Element:"+res.get(0)+"\nMaximum Element:"+res.get(1));
	}

}
