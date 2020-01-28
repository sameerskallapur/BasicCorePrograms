package com.bl.algorithm.PrimeNumberAnagramAndpalindrome;

import java.util.*;

public class PrimePalindrome {
	
	static ArrayList<Integer> PalindromeList = new ArrayList<Integer>(); 
	
	public void Palindromes(String pnList) {
		String[] arr = pnList.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int x = Integer.parseInt(arr[i]);
			palindromeVerification(x);
		}
		System.out.println("Total number of palindromes found are "+PalindromeList.size());
		System.out.println(PalindromeList);
	}
	
	public static void palindromeVerification(int x) {
		 int num = x, reversedInteger = 0, remainder, originalInteger;
	        originalInteger = num;
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }
	        if (originalInteger == reversedInteger) {
	        	PalindromeList.add(x);
			}
	            
	}
}


