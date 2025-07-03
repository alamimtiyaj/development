package com;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str="Java";
		int len=str.length();
		
		
		System.out.println(removeDuplicate(str,len));
	}
	
	public static String removeDuplicate(String str,int len) throws NegativeArraySizeException, NullPointerException
	{
		int index = 0;
		char[] c=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			int j;
			for( j=0; j<i;j++)
				if(c[i]==c[j])
				{
					break;
				}
			if(j==i)
			{
				c[index++]=c[j];
			}
		}
		
		
		return String.valueOf(Arrays.copyOf(c,index));
		
		
	}

}
