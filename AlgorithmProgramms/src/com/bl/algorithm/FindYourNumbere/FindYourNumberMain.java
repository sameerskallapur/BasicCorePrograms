package com.bl.algorithm.FindYourNumbere;
import java.util.*;

import java.util.Scanner;

public class FindYourNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		FindYourNumberBL Fn = new FindYourNumberBL();
		long high = FindYourNumberBL.High(n);
		Fn.FindingNumber(0,high);
		
		
	}

}
