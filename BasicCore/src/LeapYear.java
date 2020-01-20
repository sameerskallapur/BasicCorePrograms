import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to be checked ");
		int year = sc.nextInt();
		boolean flag = false;
		int digits = year;
		int count=0;		
		while (digits!=0) {
			digits = digits / 10 ;
			count++;
		}
		if (count!=4) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		if (year % 400 == 0) {
			flag= true;
			
		}
		else if (year % 100==0) {
			flag = false;
		}
		
		else if (year % 4 ==0 ) {
			flag = true;
		}
		
		else {
			flag = false;
		}
		
		if (flag!= true) {
			System.out.println(year+" is not a leap year");
		}
		else {
			System.out.println(year+" is a leap year");
		}
	}

}
