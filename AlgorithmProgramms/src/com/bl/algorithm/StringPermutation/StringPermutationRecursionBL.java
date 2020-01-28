package com.bl.algorithm.StringPermutation;

public class StringPermutationRecursionBL {

	public static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	public static void CharPermutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			CharPermutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
		
}
}
