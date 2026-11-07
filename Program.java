package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Program {

	public static void main1(String[] args) {
		Vector<Integer> v = new Vector<>(); 
		System.out.printf("Size : %d capacity : %d\n",v.size(),v.capacity());//0 10 
		for(int i = 1 ; i<=10 ; i++)
			v.add(i); 
		System.out.printf("Size : %d capacity : %d\n",v.size(),v.capacity());//10 10
		v.add(11); 
		System.out.printf("Size : %d capacity : %d\n",v.size(),v.capacity());//11 20
		for(int i = 12 ; i<=20 ; i++)
			v.add(i); 
		System.out.printf("Size : %d capacity : %d\n",v.size(),v.capacity());//20 20
		v.add(21); 
		System.out.printf("Size : %d capacity : %d\n",v.size(),v.capacity());//21 40
	}
	public static void main2(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		System.out.printf("size : %d\n",list.size()); // size = 0  capacity = 10
		for(int i = 1 ; i<=10 ; i++)
			list.add(i);
		System.out.printf("size : %d\n",list.size()); // size = 10  capacity = 10
		list.add(11); 
		System.out.printf("size : %d\n",list.size()); // size = 11  capacity = 15
		for(int i = 12 ; i<=15 ; i++)
			list.add(i);
		System.out.printf("size : %d\n",list.size()); // size = 15  capacity = 15
		list.add(16); 
		System.out.printf("size : %d\n",list.size()); // size = 16  capacity = 22
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(); 
		List<Integer> list = Collections.synchronizedList(l); 
		//list --> Synchronized/Thread-safe 
		// Collections.synchronizedList() creates a synchronization wrapper on given list
		// "list" is synchronized.

	}

}
