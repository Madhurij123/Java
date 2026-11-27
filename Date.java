package clg.dkte;
import java.util.*;
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	Date()
	{
		this(01, 8, 2004);  //Constructor Chaining
	}
	Date(int day, int month, int year)
	{
		this.day = day;
		this.month =  month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void acceptDate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day:");
		day = sc.nextInt();
		
		System.out.println("Enter a month:");
		month = sc.nextInt();
		
		System.out.println("Enter a year:");
		year = sc.nextInt();
	}
	
	public void printDate()
	{
		System.out.println("Day:"+day);
		System.out.println("Month:"+month);
		System.out.println("Year:"+year);

	}
}
