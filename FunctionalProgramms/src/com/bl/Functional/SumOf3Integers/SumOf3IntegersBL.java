package com.bl.Functional.SumOf3Integers;

public class SumOf3IntegersBL {

	public static void FindTriplets(int arr[],int length) {
		boolean found = false;
		 int n = length;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-2; j++) {
				for (int k = j+1; k < n; k++) {
					if (arr[i]+arr[j]+arr[k]==0) {
						found = true;
						System.out.println("The Triplets are "+ arr[i]+","+arr[j]+","+arr[k]);
					}
				}
				
			}
			
		}
		
		if (found==false) {
			System.out.println("There are no trplets whose sum would be zero");
		}		
		
	}
}
