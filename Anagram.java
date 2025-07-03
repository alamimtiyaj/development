package com;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s="dog";
		String s1="God";
		
		if(s.length()==s1.length())
		{
			char[] word=s.toLowerCase().toCharArray();
			char[] word1=s1.toLowerCase().toCharArray();
			
			Arrays.sort(word);
			Arrays.sort(word1);
			boolean b=Arrays.equals(word, word1);
			if(b)
			{
				System.out.println("They are Anagram");
			}
			else
			{
				System.out.println("they are not");
			}
		}
		else
		{
			System.out.println("length are not equal");
		}
		
	}	

}
