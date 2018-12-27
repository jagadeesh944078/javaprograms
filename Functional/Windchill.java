package com.bridgelabz.Functional;

public class Windchill 
{

	public static void main(String[] args) 
	{
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
	//	double t=0;
//double v=0;
		double w=0;
		if(t<50)
		{
			if( v<120 && v>3) 
			{ 
				w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v, 0.16));
				System.out.println("the wind chill is : "+w);
			}
			else
				System.out.println("the wind  value entered is not in the range");
		}
		else
			System.out.println("the temperature value is not in the range");

	}
}