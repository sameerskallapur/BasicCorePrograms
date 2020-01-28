package Demo2;

import java.util.Scanner;
import java.util.*;

public class demo1 {

	static String s = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int ip = sc.nextInt();
		demo1 d1 = new demo1();
		d1.Printing(ip);
	}
		
	public static void Printing(int ip) {
		

		{
			for (int i = 0; i < ip; i++) {
		
				if (ip==1) {
					System.out.println(ip);
				}else {
					System.out.println(s+i);	
				}
				
				
		}
			
		}
		
	}

}
