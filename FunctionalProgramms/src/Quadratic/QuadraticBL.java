package Quadratic;

public class QuadraticBL {


	public QuadraticBL() {
//		// TODO Auto-generated constructor stub
//		Quadratic qb = new Quadratic(a, b, c);
//
//		QuadraticRoots(a,b,c);
	}
	
	public static void QuadraticRoots(double a, double b, double c) {
		double root1 = 0;
		double root2 = 0;
		double delta  = Math.pow(b, 2)-4*(a*c);
		try {
			if (delta==0) {
				 System.out.println("Root1 = Root2 = " + -b/2*a);
			}
			else if (delta>0){
				root1= (- b + Math.sqrt(delta)/ (2 * a));
				root2= (- b - Math.sqrt(delta) / (2 * a));
				   System.out.println("Root1 is " + root1 );
				   System.out.println("Root2 is " +root2);
			            
			}
			else {
				double realPart = -b/2*a;
				double imaginaryPart = Math.sqrt(-delta) / (2 * a);
				System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
			}
			
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Divide by zero exception"); 
		}
		
		
	}
	
}
