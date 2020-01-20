import java.util.*;
public class PowerOf2 {

	public static void PowerValueCheck(int p)throws ArithmeticException {
		
		if (p>=31) {
			throw new ArithmeticException("Int OverFlow");
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of power");
		int power = sc.nextInt();
		PowerOf2 p2 = new PowerOf2();
//		int finalValue = (int) Math.pow(2, power);
		PowerValueCheck(power);
		for (int i = 0; i <= power; i++) {
			System.out.println("2 power "+i+" is "+Math.pow(2, i));
		}
	}

}
