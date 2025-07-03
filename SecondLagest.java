package com;

public class SecondLagest {
	public static void main(String[] args) {
		
		int[] arr= {100,120,80,40,60};
		int largest=0;
		int secLargest=0;
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]> secLargest)
			{
				secLargest=arr[i];
			}
		}
		System.out.println("Largest:: "+largest);
		System.out.println("SecLargest:: "+secLargest);
		System.out.println("sm"+ smallest);
	}

}
