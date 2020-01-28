package com.bl.Junit.dyOfWeek;

import com.bl.Junit.Utility.Utility;

public class DayofWeekMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		int y = Utility.InputInt();
		System.out.println("Enter the month from 1-12");
		int m = Utility.InputInt();
		System.out.println("Enter the date");
		int date = Utility.InputInt();
		String day = DayOfWeekBL.dayOfWeek(y, m, date);
		System.out.println("Day of the given date is " + day);
	}

}
