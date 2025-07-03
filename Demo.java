package com;

public class Demo {
	
	public static boolean number(int a,int b)
	{
		int totalNumber=88;
		int totalSum;
		totalSum = a+b;
		int sub=a-b;
		int revSub=b-a;
		
		if(a==totalNumber || b==totalNumber)
		{
			return true;
		}
		else if(totalSum==totalNumber)
		{
			return true;
		}
		else if(sub==totalNumber || revSub==totalNumber)
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(number(98,11));
	}

	
	

}
