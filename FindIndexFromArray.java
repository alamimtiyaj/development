package com;

public class FindIndexFromArray {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 9, 5, 7 };
		int len = arr.length;
		int num = 10;

		// findIndex(arr,len, num);
		System.out.println(findIndex(arr, len, num));
	}

//	public static String findIndex(int[] arr, int len, int num) {
//		int i = 0;
//		while (i < len) {
//
//			if (arr[i] == num)
//			{
//				return "The index of the value is: "+i;
//			} 
//			else 
//			{
//				i = i + 1;
//			}
//		}
//
//		// System.out.println("The value of "+ i);
//		return "The index of the value is not found";
//
//	}
	
	public static String findIndex(int[] arr, int len, int num) {
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]==num)
			{
				return "The index of the value is: "+i;
			}
			
		}
		
		return "The index of the value is not found";			
	}

}
