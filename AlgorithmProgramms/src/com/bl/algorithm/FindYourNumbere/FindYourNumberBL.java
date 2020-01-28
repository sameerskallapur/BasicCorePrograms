package com.bl.algorithm.FindYourNumbere;
import java.util.*;

public class FindYourNumberBL {

	public static void FindingNumber(int low ,long high) {
		
		int mid = mid(low,high);
		
		System.out.println("Is "+mid+" your number? If yes press 0");
		System.out.println("If your number is greater than the given number then press 2");
		System.out.println("If your number is Smaller than the given number then press 1");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input == 0) {
			System.out.println("Guess Successfull");
			System.exit(0);
		} 
		if (input == 1) {
		low = low ;
		high = mid;
		FindingNumber(low, high);
		
		} 
		if (input == 2) {
			low=mid;
			high = high;
			FindingNumber(low,high);
		}
			
		
	}
	public static long High(int n) {
		long high = (long) Math.pow(2, n);
		return high;
		
	}
	public static int mid(int low , long high) {
		int mid = (int) ((low+high)/2);
		return mid;
		
	}
}
