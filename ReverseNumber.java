package com;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		int num=12768;
		int reverse=0;
		
		while(num!=0)
		{
			int reminder= num%10;
			reverse= reverse*10+reminder;
			num=num/10;
		}
		
		System.out.println(reverse);

		
	}
	
	
	
}
