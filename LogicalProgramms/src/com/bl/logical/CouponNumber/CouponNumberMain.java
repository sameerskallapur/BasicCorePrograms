package com.bl.logical.CouponNumber;
import java.util.*;

public class CouponNumberMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of Coupons"); 
    	int n = sc.nextInt();
    	CouponNumberBL Cp = new CouponNumberBL();
        int count = Cp.collect(n);
        System.out.println("Random Count required to have distinct coupon numbers "+count);
    } 
} 
