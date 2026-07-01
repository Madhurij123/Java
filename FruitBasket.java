package com.app.fruits;
import java.util.*;
public class FruitBasket {
  
	 static Scanner sc = new Scanner(System.in);

		public static int menuList()
	{

		int ch;
		System.out.println("\n0.Exit");
		System.out.println("1.Add Apple");
		System.out.println("2.Add Mango");
		System.out.println("3.Add Orange");
		System.out.println("4.Display Names");
		System.out.println("5.Display Fresh Fruits");
		System.out.println("6.Display Fruit stale");
		System.out.println("7.Mark Fruit stale");
		System.out.println("8.Marks all sour fruits stale");
		
        System.out.println("Enter a Choice");
        ch = sc.nextInt();
        return ch;
	}
	
	
	public static void main(String[] args)
	{
		int size;
		System.out.println("Enter a Basket Size:");
		size = sc.nextInt();
		
		Fruit basket[] = new Fruit[size];
		int count = 0;
		int ch;
		while((ch = menuList()) != 0)
		{
			switch(ch)
			{
			case 1:
				if(count < basket.length) {
					System.out.println("Enter Name, Color & weight :");
					basket[count++] = new Apple(sc.next(),sc.next(),sc.nextDouble(), true);
				}else {
					System.out.println("Basket Full..!!");
				}
				break;
			case 2:
				if(count < basket.length) {
					System.out.println("Enter Name, Weight & Color:");
					basket[count++] = new Mango(sc.next(),sc.next(),sc.nextDouble(), true);
				}else {
					System.out.println("Basket Full..!!");
				}
				break;
			case 3:
				if(count < basket.length) {
					System.out.println("Enter Name, Weight & Color:");
					basket[count++] = new Orange(sc.next(),sc.next(),sc.nextDouble(), true);
				}else {
					System.out.println("Basket Full..!!");
				}
				break;
			case 4:
				for(Fruit f : basket) {
					if(f != null)
						System.out.println(f.getName());
					break;
				}
			case 5:
				for(Fruit f : basket)
				{
					if(f != null && f.isFresh()) {
						System.out.println("Taste:" +f.taste());
					}
				}
				break;
			case 6:
				for(Fruit f : basket) {
					if(f != null && f.isFresh()) {
						System.out.println(f.taste());
					}	
				}
				break;
			case 7:
				System.out.println("Enter Index:");
				int index = sc.nextInt();
				
				if(index >= 0 && index < count) {
					basket[index].setFresh(false);
					System.out.println("Fruit marked stale");
				}
				else {
					System.out.println("Invalid Index");
				}
				break;
			case 8:
				for(Fruit f : basket)
				{
					if(f != null && f.taste().equalsIgnoreCase("sour")) {
						f.setFresh(false);
					}
					System.out.println("All sour fruits marked stale");
				}
				break;
			default:
				System.out.println("Invalid Choice");
				continue;
			}
         
		}
		sc.close();

	}
	
}
