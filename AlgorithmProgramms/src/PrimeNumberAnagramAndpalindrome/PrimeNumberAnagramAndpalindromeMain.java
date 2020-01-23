package PrimeNumberAnagramAndpalindrome;
import java.util.*;



public class PrimeNumberAnagramAndpalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int def = 0;
		System.out.println("Enter the start of range ");
		int m = sc.nextInt();
		System.out.println("Enter the end of range ");
		int n = sc.nextInt();
		PrimeNum Pn = new PrimeNum();
		PrimePalindrome Pp = new PrimePalindrome();
		PrimeAnagram Pa = new PrimeAnagram();
		String PnList = Pn.primenumber(m,n);
		Pa.Anagram(PnList);
		Pp.Palindromes(PnList);
		
		
		

	}

}
