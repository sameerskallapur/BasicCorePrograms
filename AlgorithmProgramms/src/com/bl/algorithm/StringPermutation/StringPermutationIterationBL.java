package com.bl.algorithm.StringPermutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationIterationBL {

	public static void permutations(String s)
	{
		List<String> partial = new ArrayList<>();

		partial.add(String.valueOf(s.charAt(0)));

		for (int i = 1; i < s.length(); i++)
		{
			for (int j = partial.size() - 1; j >= 0 ; j--)
			{
				String str = partial.remove(j);

				for (int k = 0; k <= str.length(); k++)
				{
					partial.add(str.substring(0, k) + s.charAt(i) +
								str.substring(k));
				}
			}
		}

		System.out.println(partial);
	}
}
