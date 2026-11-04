package clg.dkte;
import java.util.*;
public class Date {
private int day;
private int month;
private static int year;

public Date()
{
	System.out.println("Public Date()");
}

public Date(int day, int month, int year) {
	this.day = day;
	this.month = month;
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

public static int getYear() {
	return year;
}

public  void setYear(int year) {
	Date.year = year;
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
public void display()
{
	System.out.printf("Day:%d\nMonth:%d\nYear:%d",day,month,year);
}
}
