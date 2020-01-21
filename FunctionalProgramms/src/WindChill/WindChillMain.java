package WindChill;
import java.util.*;


public class WindChillMain {

	public static void main(String[] args) throws WindChillException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the temperature ");
//		try {
			int t =sc.nextInt();
			System.out.println("Enter the wind Speed");
			int v =sc.nextInt();
			WindChillBL Wbl = new WindChillBL();
			Wbl.WindChill(t,v);
//			} 
//			catch (Exception e) {
//			// TODO: handle exception
//				System.err.println(ex);
//		}
		
	}

}
