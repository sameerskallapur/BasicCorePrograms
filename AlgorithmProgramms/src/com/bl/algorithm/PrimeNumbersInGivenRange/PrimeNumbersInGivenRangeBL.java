package com.bl.algorithm.PrimeNumbersInGivenRange;

public class PrimeNumbersInGivenRangeBL {

	public static void primenumbers(int m ,int n) {
		// TODO Auto-generated method stub
//		int m; 
//		int flag = 0;
//		for (int i = 0; i < n; i++) {
//			if (i == 0 || i==1) {
//				flag = 0;
//			}
//		
//			for (int j = 2; j <= i; j++) {
//				if (i%j==0) {
//					flag = 1;
////					break;
//				}else {
//					flag = 0;
//				}
//				
//			}
//			if (flag==0) {
//				System.out.print(i+",");
//			}
//			
//		}
//	}

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
	   }
	}


	
