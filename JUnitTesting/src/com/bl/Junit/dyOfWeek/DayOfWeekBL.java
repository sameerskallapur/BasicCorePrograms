package com.bl.Junit.dyOfWeek;

import com.bl.Junit.Utility.Utility;

public class DayOfWeekBL {

	public static String dayOfWeek(int year, int month, int date) {
		int day =  Utility.dayOfWeek(year, month, date);
		String dayString;
		switch (day) { 
	        case 1:
	        	dayString = "Monday"; 
	            break; 
	        case 2:
	            dayString = "Tuesday"; 
	            break; 
	        case 3:
	            dayString = "Wednesday"; 
	            break; 
	        case 4:
	            dayString = "Thursday"; 
	            break; 
	        case 5:
	            dayString = "Friday"; 
	            break; 
	        case 6:
	            dayString = "Saturday"; 
	            break; 
	        case 0: 
	            dayString = "Sunday"; 
	            break; 
	        default: 
	            dayString = "Invalid day"; 
	            break; 
	}
		return dayString;
}
}
