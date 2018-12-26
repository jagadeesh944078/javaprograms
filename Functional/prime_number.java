/*
 * this program takes the range of numbers and shows only  the prime numbers in that range
 * @param  
 */
package com.bridgelabz.Functional;

import com.bridgelabz.utility.utility;

public class prime_number {

	public static void main(String[] args) 
	{
		System.out.println("enter the range of numbers");
		int n1=utility.getInt();
		int n2=utility.getInt();
		for (int i = n1; i <=n2; i++) 
			
			
		{
			boolean rs= utility.isPrime(i);
			if(rs)
			{
			
				System.out.print(i+" ");
			}
		}
	}

}
