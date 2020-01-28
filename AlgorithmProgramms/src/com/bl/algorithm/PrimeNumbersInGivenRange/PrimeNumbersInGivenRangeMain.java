package com.bl.algorithm.PrimeNumbersInGivenRange;
import java.util.*;
import java.io.*;

public class PrimeNumbersInGivenRangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int def = 0;
		System.out.println("Enter the start of range ");
		int m = sc.nextInt();
		System.out.println("Enter the end of range ");
		int n = sc.nextInt();
		PrimeNumbersInGivenRangeBL Prime = new PrimeNumbersInGivenRangeBL();
		Prime.primenumbers(m,n);
		
	}

}
