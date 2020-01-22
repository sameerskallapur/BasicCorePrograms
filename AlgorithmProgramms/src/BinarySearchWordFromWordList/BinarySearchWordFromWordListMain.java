package BinarySearchWordFromWordList;

import java.util.*;
import java.nio.file.Paths;
import java.io.*;


public class BinarySearchWordFromWordListMain {
	

	public static void main(String[] args) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 String FilePath = System.getProperty("user.dir")+"/src/BinarySearchWordFromWordList/TextFile.txt";
		 BufferedReader br = new BufferedReader(new FileReader(FilePath));
		 String FileContent= br.readLine();
		 BinarySearchWordFromWordListBL Bs = new BinarySearchWordFromWordListBL();
		 String Values[] = Bs.ReadingContents(FileContent);
		 String SortedArray[] = Bs.ArraySort(Values);
		 System.out.println("Enter the element to be searched");
		 String Element = sc.nextLine();
		 Boolean Found = Bs.BinarySearch(Element,SortedArray);
		 System.out.println("Element is Found = "+Found);
		 



  }
}









