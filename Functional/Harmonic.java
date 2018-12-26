package com.bridgelabz.Functional;
import com.bridgelabz.utility.*;
public class Harmonic 
{

	public static void main(String[] args) 
	{
        int N=utility.getInt();
        System.out.println(N);
        double sum=0;
        for (double i = 1; i <=N; i++) 
        	{
    			sum=sum+1/i;
    			
    		}
        System.out.println("the "+ N +" harmonic number is "+ sum);
	}

}
