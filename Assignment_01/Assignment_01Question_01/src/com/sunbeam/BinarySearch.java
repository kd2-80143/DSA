package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarysearch(int arr[], int size, int key)
	{
		int left = 0 , right = size -1 , mid, count = 0;
		
		while(left <= right)
		{
			mid = (left+right)/2;
			if(key==arr[mid])
			{
				count++;
				return count;
			}
			else if(key > arr[mid])
			{
				count++;
				left = mid + 1;
			}
			else 
			{
				count++;
				right = mid -1;
			}
		}
			return count;
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter the element to search");
		Scanner sc = new Scanner(System.in);
		int key =  sc.nextInt();
		
		int count = binarysearch(arr,arr.length,key);
		if(count != -1)
		{
			System.out.println("Number of comparisons " +count);
		}
	}

}
