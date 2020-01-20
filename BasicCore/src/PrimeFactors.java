import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int N = sc.nextInt();
		PrimeFactors(N);
		
	}
	
	public static void PrimeFactors(int x) {
		System.out.println("PrimeFactors of "+x+" are ");
		while (x%2==0) {
			System.out.println(2);
			x=x/2;
		}
		for (int i = 3; i <= Math.sqrt(x) ; i++) {
		
			while (x%i==0) {
				System.out.println(i);
				x=x/i;
			}
			if (x>2) {
				System.out.println(x);
			}
			
		}
		
	}

}
