package com.bl.algorithm.Regex;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;



public class RegexMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Message = "Hello <<name>>, "
				+ "We have your full name as <<full name>> in our system. "
				+ "your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter FullName");
		String FullName = sc.nextLine();
		System.out.println("Enter Mobile number");
		String number = sc.nextLine();
		RegexBL Rx = new RegexBL();
		boolean nameValue = Rx.InsertName(name);
		boolean fullNameValue = Rx.InsertName(FullName);
		if (nameValue==true &&fullNameValue== true) {
			Message = Message.replace("<<name>>",name);
			Message = Message.replace("<<full name>>",FullName);
		}
		else {
			System.out.println("Names can only contain letteres from A-Z or a-z");
			System.exit(0);
		}
		boolean numbervalue = Rx.InsertNumber(number);
		if (numbervalue) {
			Message = Message.replaceAll("91-xxxxxxxxxx", "91-"+number);
		} else {
			System.out.println("The phone number can not have anything other than 10 digits from 0-9");
			System.exit(0);
		}
		LocalDate date = Rx.date();
		String s = date.toString();
		System.out.println("Message = "+ Message.replace("01/01/2016", s));
		
		}

	}


