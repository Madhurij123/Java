package day1;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {

		/*
		 * int num1 = 10; //Iitialization done only once //int num1 = 40;--------Complie
		 * time Error num1 = 30; //Assignement done multiple time
		 * 
		 * System.out.println(num1);
		 */
		
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		System.out.println(day+"/"+month+"/"+year);
		
	}

}
