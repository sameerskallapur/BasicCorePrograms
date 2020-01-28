package com.bl.Junit.TempConversion;
import java.util.*;

import com.bl.Junit.Utility.Utility;

public class TempConversionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To which standard do you want to Convert?(Ex - type C for Celsius and F for Fahrenheit)");
		char ch = Utility.InputChar();
		int a = TempConversionBL.TempConversion(ch);
		System.out.println("Enter the Temperature");
		double t = Utility.InputInt();
		double Temperature = Utility.temperaturConversion(t, a);
		System.out.println("The converted temperature is "+Temperature+ch);
	}

}
