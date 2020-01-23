package PrimeNumbersInGivenRange;
import java.util.*;
import java.io.*;

public class PrimeNumbersInGivenRangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start of range(if kept empty then 0 is default) ");
		int m = sc.nextInt();
		if (m==) {
			
		}
		System.out.println("Enter the end of range ");
		int n = sc.nextInt();
		PrimeNumbersInGivenRangeBL Prime = new PrimeNumbersInGivenRangeBL();
		Prime.primenumbers(m,n);
		
	}

}
