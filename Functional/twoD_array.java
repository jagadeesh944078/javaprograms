package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class twoD_array {

	public static void main(String[] args) 
	{   Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m=utility.getInt();
        System.out.println("enter the number of columns");
        int n=utility.getInt();
        double[][] arr=new double[m][n];
        System.out.println("enter the array elements");
        for (int i = 0; i < m; i++) 
        {
        	for (int j = 0; j < n; j++) 
        	{
				arr[i][j]=sc.nextDouble();
			}
        	System.out.println();
			
		}
        System.out.println("the entered array elements are");
        for (int i = 0; i < m; i++) 
        {
        	for (int j = 0; j < n; j++) 
        	{
				System.out.print(arr[i][j]+" ");
			}
        	System.out.println();
        	
			
		}
        
	}

}
