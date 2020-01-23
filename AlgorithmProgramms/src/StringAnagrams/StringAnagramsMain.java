package StringAnagrams;

import java.util.Scanner;

public class StringAnagramsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		StringAnagramsBL anagram= new StringAnagramsBL();
		anagram.Anagram(S1, S2);
		

	}

}
