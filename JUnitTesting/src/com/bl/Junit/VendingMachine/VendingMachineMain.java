package com.bl.Junit.VendingMachine;
import java.util.*;
import com.bl.Junit.Utility.Utility;

public class VendingMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Amount");
		int amount = Utility.InputInt();
		VendingMachineBL.countCurrency(amount);
	}

}
