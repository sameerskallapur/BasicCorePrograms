package com.bl.algorithm.StringPermutation;
import java.util.*;


public class StringPermutationIterationMain {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringPermutationIterationBL Iteration = new StringPermutationIterationBL();
		Iteration.permutations(s);
	}
	
}
		
	

