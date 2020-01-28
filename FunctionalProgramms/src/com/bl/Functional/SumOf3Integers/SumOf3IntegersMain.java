package com.bl.Functional.SumOf3Integers;

import java.util.Scanner;


public class SumOf3IntegersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int length = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[] = new int[length] ;
		for (int i = 0; i <length; i++) {
			arr[i] = sc.nextInt();
		}
		
		SumOf3IntegersBL sbl = new SumOf3IntegersBL();
		sbl.FindTriplets(arr, length);
		
	}

}
