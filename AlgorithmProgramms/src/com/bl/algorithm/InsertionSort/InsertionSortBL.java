package com.bl.algorithm.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortBL {

	public static String[] ReadArray(int n, String[] inputArray) {
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number "+i);
			Scanner sc = new Scanner(System.in);
			inputArray[i] = sc.nextLine();
		}
		System.out.println("Before Sorting "+ Arrays.toString(inputArray));
		return inputArray;
		
	}
	
	public static void InsertionSorting(String[] inputArray) {
		  int i,j;
		  String key;
		  
		  for (j = 1; j < inputArray.length; j++) {
		    key = inputArray[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(inputArray[i]) > 0) {
		        break;
		      }
		      inputArray[i + 1] = inputArray[i];
		      i--;
		    }
		    inputArray[i + 1] = key;
//		    System.out.println(Arrays.toString(inputArray));
		  }
		  System.out.println("After Sorting "+ Arrays.toString(inputArray));
	
		
	}
	
}
