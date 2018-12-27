
package com.bridgelabz.Functional;

import java.util.Random;

import com.bridgelabz.utility.utility;

public class gambler1 {

	public static void main(String[] args) 
	{
		System.out.println("enter the stake amount you want to bet");
		int stake=utility.getInt();
		System.out.println("enter the goal amount you want to win");
		int goal=utility.getInt();
		System.out.println("enter the number of times you want to bet");
		int bets=utility.getInt();
		int target=goal;
		int win=0;
		int loose=0;
		Random rn=new Random();
		while(bets!=0 && stake!=0 && stake!=target)
		{
			int r=rn.nextInt(2);
			if(r==1)
			{
				bets--;
				win++;
				stake=stake+1;
				if(stake==goal) 
				{
					System.out.println("you won "+ "$"+goal);
					break;
				}


			}
			else
			{
				bets--;
				loose++;
				stake=stake-1;
				if(stake==0)
				{
					System.out.println("you lost your stake");
					
					
					
					
					
					break;

				}

			}
		}
		if(stake==target)
		{
			System.out.println("you won the amount you wanted to win");
			System.out.println("you won $"+stake);
		}
		else
		{
			System.out.println("you could not reach your target");
			if(bets==0) {
			System.out.println("you could not reach your target because the number of bets got over ");}
			if(stake==0)
			{
				System.out.println("your amount drained out");
			}
			System.out.println("the reamining amount with you is "+"$"+stake);
		}
		
		System.out.println("the number of times you won "+win);
		System.out.println("the number of times you lost "+loose);
		double t=win+loose;
		double wp=(win/t)*100;
		double lp=(loose/t)*100;

		System.out.println("percentage of wins :"+wp);
		System.out.println("percentage of loose :"+lp);

	}

}
