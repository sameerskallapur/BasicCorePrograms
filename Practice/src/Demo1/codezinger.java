package Demo1;
import java.util.*;
import java.util.stream.IntStream;

public class codezinger {

	 	static ArrayList<Integer> al = new ArrayList<Integer>();
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	        int[] arr1 = { 1,5,9,2,2,4 }; 
	        int[] arr2 = { 13,3,12,2,12,3,4 };
	        codezingerBL cod = new codezingerBL();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the magic number");
	        int magicNum = sc.nextInt();
	        arr1 = cod.RemoveDuplicates(arr1);  
	        arr2 = cod.RemoveDuplicates(arr2);
	        int x = cod.removeAllRepeatedAfterMerge(arr1,arr2,al);
	        if (x==-1) {
				System.out.println("We cant continue the program as there are no unique elements after merging");
				System.exit(0);
			}
	        
	        
	        
			}
	        
	       
	    } 
	

