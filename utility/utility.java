/*
 * 
 */
package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class utility 
{ static  Scanner sc=new Scanner(System.in);
   
    //this method is used to get integer type value from the user
    
	public static int getInt()
	{ 
		System.out.println("enter the number");
		int i=sc.nextInt();
		return i;
	}
	//this method is used to get byte  type value from the user
    
		public static String getString()
	{
		System.out.println("enter the string");
		String i=sc.next();
		return i;
	}
	 //this method is used to get float type value from the user
	
	public static int power(int b,double p)
	{
		int pw=1;
		while(p>0)
		{
			pw=b*pw;
			p--;
		}
		return pw;
	}
	@SuppressWarnings("unused")
	/*
     * this method returns the swapped string 
     * @param it takes string as input
     * 
     */
		public static boolean isPrime(int n) 
	    { 
	        if (n <= 1) 
	            return false; 
	       
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	       
	        return true; 
	    } }
	