package com.bridgelabz.Functional;
import java.util.*;
public class Quadratic {
public static void main(String[] args)
{Scanner s1=new Scanner(System.in);
System.out.println("enter the a value");
int a=s1.nextInt();
System.out.println("enter the b value");
int b=s1.nextInt();
System.out.println("enter the c value");
int c =s1.nextInt();
rootEquation(a,b,c);
}
public static void rootEquation(int a,int b,int c) {
if(a==0)
{System.out.println("roote are not real");

	}
else {
	double delta=b*b-4*a*c;

if(delta>0)
{double root1=(-b+Math.sqrt(delta))/(2*a);
double root2=(-b-Math.sqrt(delta))/(2*a);
System.out.println("roots are real and unequal ");
System.out.println("first root of the equation is "+root1);
System.out.println("second root of the equation is "+root2);}
else if(delta==0) {
	double root1=-b/(2*a);
System.out.println("roots are real and eqaul");
System.out.println("first root of the equation is "+root1);
System.out.println("second root of the equation is "+root1);

		
	}
else
{
	System.out.println("roots are imaginary");
	double a1=-b/(2*a);
	double a2=Math.sqrt(-delta/(2*a));
	System.out.println("the first root is "+a1+"+"+"i"+a2);
	System.out.println("the second root is "+a1+"-"+"i"+a2);
}
	}
	}
}
