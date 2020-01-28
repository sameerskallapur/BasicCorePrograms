package com.bl.Junit.monthlyPayment;
import java.util.*;

import com.bl.Junit.Utility.Utility;

public class monthlyPaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year ");
		float year = Utility.InputFloat();
		System.out.println("Enter the Principal amount ");
		int principal = Utility.InputInt();
		System.out.println("Enter the rate of interest ");
		float rate = Utility.InputFloat();
		float payment = Utility.monthlyPayment(year, principal, rate);
		System.out.println("The payment is "+payment);
	}

}
