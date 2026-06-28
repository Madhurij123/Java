package clg.dkte;


public class Date extends Object implements Cloneable{

	private int day;
	private int month;
	private int year;
	
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Object other = super.clone(); //beacause object class method need to extend and implmlemesnts
		return other;   
		
	}
	@Override
	public String toString()
	{
		return "DAY:"+day+"Month:"+month+"Year:"+year;
	}
}

