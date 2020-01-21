import java.util.*;

public class SumOf3Integers {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of rows");
			int r = sc.nextInt();
			System.out.println("Enter number of columns");
			int c = sc.nextInt();
			System.out.println("Enter Width of Array");
			int w = sc.nextInt();
			int[][][] arr = new int[r][c][w]; 
			SumOf3Integers A3D = new SumOf3Integers();
			readArray(r,c,w,arr);
			displayArray(r,c,w,arr);
			
		}
		
		
		public static void displayArray(int r, int c,int w,int arr[][][]) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					for (int k = 0; k < w; k++) {
						System.out.print(arr[i][j][k]);	
					}
				}
				System.out.println("");
			}

		}
		
		public static void readArray(int r,int c,int w,int arr[][][]) {
			System.out.println("Enter the Array Inputs");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					for (int k = 0; k < w; k++) {
						arr[i][j][k]=sc.nextInt();
					}					
				}
				
			}
			System.out.println("Inputs have been received");
		}


	}

