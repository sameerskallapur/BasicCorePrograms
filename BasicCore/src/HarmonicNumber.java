import java.util.Scanner;


public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = sc.nextInt();
		HarmonicNumber Hr = new HarmonicNumber();
		float HarmonicValue = Harmonic(N);
		System.err.println("Harmonic value of "+N+" is "+HarmonicValue);
		
	}

	public static float Harmonic(int n) {
		float Harmonic=1;
		if (n == 0) {
			System.out.println("Value of N can not be 0");
			System.exit(0);
		}
		if (n==1) {
			Harmonic=1;
		}
		else {
			for (int i = 2; i <= n; i++) {
				Harmonic = (float)1/i+Harmonic;
			}
		}
		return Harmonic;
		
		
	}
}
