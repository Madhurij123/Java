package day1;
class Date{
	private int date;
	private int month;
	private int year;
	
	public Date() {
		this(01,01,2008);
	}

	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void show()
	{
		System.out.println(date+"/"+month+"/"+year);

	}
	
}
public class ConstructorChaining {

	//Need to use this stmt
	public static void main(String[] args) {

		Date d = new Date();
		d.show();
	}

}
