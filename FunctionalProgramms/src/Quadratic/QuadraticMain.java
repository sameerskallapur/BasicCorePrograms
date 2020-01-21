package Quadratic;

import java.util.Scanner;

public class QuadraticMain {

	public static void main(String[] args) {
		// TODO2 Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a in quadratic equation");
		double a = sc.nextDouble();
		System.out.println("Enter the value od b in quadratic equation");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c in quadratic equation");
		double c = sc.nextDouble();
		QuadraticBL Qbl = new QuadraticBL();
		Qbl.QuadraticRoots(a, b, c);
		
	}

}
