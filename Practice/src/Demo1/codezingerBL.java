package Demo1;
import java.util.*;

public class codezingerBL {
	
//----------------------------------------------------------------------------------------------------------------------------------
		public static int[] RemoveDuplicates(int[] array) {
			int count = 0;
			 HashMap<Integer,Boolean> mp = new HashMap<>(); 
			 ArrayList<Integer> al1 = new ArrayList<Integer>();

     for (int i = 0; i < array.length; ++i) 
     { 
         if (mp.get(array[i]) == null) 
             al1.add(array[i]);
         mp.put(array[i], true); 
     }
     int[] ret = new int[al1.size()];
	    Iterator<Integer> iterator = al1.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	    }
	    System.out.println(Arrays.toString(ret));
     return ret;
     
		}

//----------------------------------------------------------------------------------------------------------------------------------
		

		public static int removeAllRepeatedAfterMerge(int[] arr1, int[] arr2, ArrayList<Integer> al) {

//	        ArrayList<Integer> al = new ArrayList<Integer>();
		    boolean found=false;
	        boolean flag = true;
			while (flag) {
	        	for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr2.length; j++) {
						if (arr1[i]==arr2[j]) {
							found = true;
							break;
						}else {
							found = false;
						}
					}
					if (found==false) {
						al.add(arr1[i]);
					}
				}
	        	for (int i = 0; i < arr2.length; i++) {
	        		for (int j = 0; j < arr1.length; j++) {
	        			if (arr2[i]==arr1[j]) {
							found = true;
							break;
						}else {
							found = false;
						}
					}
					if (found==false) {
						al.add(arr2[i]);
					}
					}
	        	flag = false;
				}
			System.out.println(al);
			if (al.isEmpty()) {
				return -1;
			}
			else {
				return 0;
			}
		}
}
