package com.bridgelabz.Functional;

import com.bridgelabz.utility.utility;

public class Getreplace {

	public static void main(String[] args) {
		
		String st= "hello <<username>> how are you";
		String s2=getReplaced(st);
		//String temp="";
		System.out.println(s2);
	}
	
		private static String getReplaced(String st)
		{
			String s3=utility.getString();
			if(s3.length()<=3)
			{
				System.out.println("pls enter atleast more than 3 char");
				return null;
			}
			else
			{String temp="";
				temp=temp+s3;
			temp=st.substring(0, 6);
			temp+=s3;
			temp+=st.substring(18,32);
			return temp;
			
			
			
			
				
			}
			
		}
		
		// TODO Auto-generated method stub

	}


