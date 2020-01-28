package com.bl.algorithm.BubbleSort;
import java.util.*;

public class BubbleSortBL {

	public static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
}

	public void printArray(int[] arr) {
		 int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	}

	public static void ReadArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Integer Elements of the array");
		for (int i = 0; i < n; i++) {
			arr[i]= sc.nextInt();
			
		}
		
	}
}

