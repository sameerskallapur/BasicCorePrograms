package com.bl.Junit.TempConversion;

public class TempConversionBL {

	public static int TempConversion(char ch) {
		char type = ch;
		int x;
		if (type=='C') {
			x = 1;
			return x;
		}
		if (type=='F') {
			x = 2;
			return x;
		}else {
			System.out.println("Wrong type of temperature");
			return 0;
		}
		
	}
}
