package com.app.geometry;

import java.util.Scanner;

	class Date
	{
		private int day;
		private	int month;
		private	int year;
		
		Scanner sc = new Scanner(System.in);
		
		public Date(int day, int month, int year)
		{
			this.day = day;
			this.month = month;
			this.year = year;
			System.out.println("Parameterized Constructor called...");
		}
		
		public void setDay(int day)
		{
			this.day = day;
		}
		
		public void setMonth(int month)
		{
			this.month = month;
		}
		
		public void setYear(int year)
		{
			this.year = year;
		}
		
		public int getDay()
		{
			return day;
		}
		
		public int getMonth()
		{
			return month;
		}
		
		public int getYear()
		{
			return year;
		}
		
		public void acceptDate()
		{
			System.out.print("Enter a day: ");
			day = sc.nextInt();
			
			System.out.print("Enter a month: ");
			month = sc.nextInt();
			
			System.out.print("Enter a year: ");
			year = sc.nextInt();
		}
		
		public void displayDate()
		{
			System.out.print(day + "/" + month + "/" + year + "\n");
		}
	}
	public class DateTest 
	{
		public static void main(String args[])
		{
			Date d = new Date(1, 9, 2006);
			d.displayDate();
			
			d.acceptDate();
			System.out.print("Entered Date: ");
			d.displayDate();
			
			d.setDay(25);
			d.getDay();
			
			d.setMonth(8);
			d.getMonth();
			
			d.setYear(1998);
			d.getYear();
			System.out.print("Updated Date: ");
			d.displayDate();
			
		}

	}


