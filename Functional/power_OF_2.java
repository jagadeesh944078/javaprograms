package com.bridgelabz.Functional;

import com.bridgelabz.utility.utility;

public class power_OF_2 {

	public static void main(String[] args) 
	{  
		System.out.println("enter the number in the range 1 to 31");
		int n=utility.getInt();
		if(n<32)
		{
			int res=utility.power(2, n);
			System.out.println(res);
			for (int i=1;i<=n;i++)
			{    
				int r=utility.power(2, i);
				if(r<=res)
					System.out.println(utility.power(2, i));
				else
					return;
			}
		}
		else
			System.out.println("enter the number in the range 1 to 31");
	}

}
