import java.sql.Array;
import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r = sc.nextInt();
		System.out.println("Enter number of columns");
		int c = sc.nextInt();
		int[][] arr = new int[r][c]; 
		Array2D A2D = new Array2D();
		readArray(r,c,arr);
		displayArray(r,c,arr);
		
	}
	
	
	public static void displayArray(int r, int c,int arr[][]) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}

	}
	
	public static void readArray(int r,int c,int arr[][]) {
		System.out.println("Enter the Array Inputs");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Inputs have been received");
	}

}
