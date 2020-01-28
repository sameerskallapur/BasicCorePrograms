package com.bl.algorithm.PrimeNumberAnagramAndpalindrome;
import java.util.*;
import java.io.*;

public class PrimeNum{
	public static String primenumber(int m ,int n) {

	int i =0;
    int num =0;
    String  primeNumbers = "";

    for (i = m; i <= n; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
    System.out.println("Prime numbers from "+m+" to "+n+" are :");
    System.out.println(primeNumbers);
	return primeNumbers;
}
	
	
}
