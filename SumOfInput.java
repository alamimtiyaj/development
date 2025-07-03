package com;

public class SumOfInput {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		int digit;
		
		while (num>0) {
			digit=num%10;
			System.out.println(digit);
			sum=sum+digit;
			num=num/10;			
			
		}
		System.out.println(sum);
	}

}
