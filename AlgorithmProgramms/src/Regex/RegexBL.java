package Regex;

import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.regex.Pattern;

public class RegexBL {

	public static boolean InsertName(String name) {
		
		if (Pattern.matches("[[A-Za-z]+(\\s)?]+", name)) {
			
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static boolean InsertNumber(String num) {
			if (Pattern.matches("\\A[0-9]{10}", num)) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
	public static LocalDate date() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDate Today = LocalDate.now();
		return Today;  
	}
	
}
