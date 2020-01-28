package com.bl.algorithm.BinarySearchWordFromWordList;
import java.util.*;
import java.nio.file.Paths;
import java.io.*;

public class BinarySearchWordFromWordListBL {

	public static String[] ReadingContents(String fileContent) {
		String FileContent = fileContent;
		 if (FileContent != null){
			   System.out.println(FileContent);
			   String Contents[] = FileContent.split(",");
				 System.out.println(Arrays.toString(Contents));
				 return Contents;
				}
		else {
			return null;
		}
		
	}
	 
	public static String[] ArraySort(String[] fileContent) {
		int low = 0;
	    int high = fileContent.length - 1;
	    int mid;		
	    for(int i = 0; i<high; i++) {
	         for (int j = i+1; j<fileContent.length; j++) {
	            if(fileContent[i].compareTo(fileContent[j])>0) {
	               String temp = fileContent[i];
	               fileContent[i] = fileContent[j];
	               fileContent[j] = temp;
	            }
	         }
	      }
	    System.out.println(Arrays.toString(fileContent));
	    return fileContent;
	}
	
	public static Boolean BinarySearch(String element, String fileContent[]) {
		
		int low = 0;
	    int high = fileContent.length - 1;
	    int mid;
	    String Key = element;
	    while (low <= high) {
			mid = (low + high) / 2;
			if (fileContent[mid].compareTo(Key)  < 0) { 
				low = mid + 1; 
				} 
			else if (fileContent[mid].compareTo(Key) > 0) {
				high = mid - 1;
			} 
			else {
				return true;
			}
		}
		return false;
	}
		
}
	

