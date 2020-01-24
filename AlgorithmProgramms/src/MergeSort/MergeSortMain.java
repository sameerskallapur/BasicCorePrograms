package MergeSort;
import java.util.*;

public class MergeSortMain {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of Strings");
			int length = sc.nextInt();
			String[] array = new String[length];
			System.out.println("Enter the list of Strings");
			for (int i = 0; i < array.length; i++) {
				array[i]= sc.nextLine();
				
			}

		 		MergeSortBL Ms = new MergeSortBL();
	            String[] sortedArray = Ms.mergeSort(array);
	            for (int i = 0; i < sortedArray.length; i++) {
	            System.out.println(sortedArray[i] + " ");
	}

}
}
