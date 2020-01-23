package PrimeNumberAnagramAndpalindrome;

import java.util.*;

public class PrimeAnagram {

	public static void Anagram(String pnList) {
		String[] arr = pnList.split(" ");
		int count = 0;
		System.out.println("total = "+arr.length);
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				count = anagramNum(arr[i],arr[j],count);
//				anagramNum("354","435");
			}
			
		}System.out.println("Toatl number of anagrams are "+ count);
		
	}
	
	public static int anagramNum(String arr, String arr2, int count) {
		char[] p = arr.toCharArray();
		char[] q = arr2.toCharArray();
		
		Arrays.sort(p);
		Arrays.sort(q);
		String x = new String(p);
		String y = new String(q);
		if (x.equals(y)) {
			count ++ ;
			System.out.println(arr+" And "+arr2+" are Anagrams");
		}
		return count;
	}
	}

