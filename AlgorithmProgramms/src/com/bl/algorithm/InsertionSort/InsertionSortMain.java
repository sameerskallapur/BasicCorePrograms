package com.bl.algorithm.InsertionSort;
import java.util.*;

public class InsertionSortMain {

	public static void main(String[] args) {


		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number of elements of Strings");
		  int n = sc.nextInt();
		  String[] inputArray = new String[n];
		  InsertionSortBL Insertion = new InsertionSortBL();
		  System.out.println("Enter String elements of Array");
		  inputArray = Insertion.ReadArray(n, inputArray);
		  Insertion.InsertionSorting(inputArray);


	}

}
