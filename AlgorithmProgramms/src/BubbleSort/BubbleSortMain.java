package BubbleSort;

import java.util.Scanner;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		BubbleSortBL Bs = new BubbleSortBL(); 
	    int arr[] = new int[n];
		Bs.ReadArray(arr,n);
	    Bs.bubbleSort(arr);
	    System.out.println("Sorted array"); 
	    Bs.printArray(arr); 
	}

}
