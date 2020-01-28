package com.bl.algorithm.StringPermutation;

import java.util.Scanner;

public class StringPermutationRecursionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringPermutationRecursionBL Recursion = new StringPermutationRecursionBL();
		Recursion.CharPermutations(s.toCharArray(), 0);;
	

	}

}
