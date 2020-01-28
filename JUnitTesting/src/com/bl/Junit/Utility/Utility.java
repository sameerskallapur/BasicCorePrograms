package com.bl.Junit.Utility;

import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int InputInt() {
		int input = sc.nextInt();
		return input;

	}

	public static String InputString() {
		String input = sc.nextLine();
		return input;

	}
	
	public static float InputFloat() {
		float input = sc.nextFloat();
		return input;

	}

	public static char InputChar() {
		char input = sc.next().charAt(0);
		return input;

	}

	public static int dayOfWeek(int year, int month, int date) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - (y / 100) + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (date + x + (31 * m) / 12) % 7;
		return d;

	}

	public static double temperaturConversion(double t, int x) {
		int type = x;
		double Temperature = 0;
		switch (type) {
		case 1:
			Temperature = (t - 32) * 5 / 9;
			System.out.println(Temperature);
			break;
		case 2:
			Temperature = (t * 9 / 5) + 32;

			break;
		default:
			break;
		}
		return Temperature;

	}

	public static float monthlyPayment(float y , float p , float r) {

		float n = y*12;
		float rate = r/(12*100);
		float payment = (float) ((p*rate)/(1-Math.pow((1+rate), -n)));
		return payment;
	}

}
