package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int rankofElement(int arr[], int size, int key)
	{
		int count = 0;
		for (int i = 0 ; i < size ; i++)
		{
			count++;
			if(arr[i]==key)
			{
				return count;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[] = {10,20,15,3,4,4,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to find it's rank");
		int key = sc.nextInt();
		
		int rank = rankofElement(arr,arr.length,key);
		if(rank!=-1)
		{
		System.out.println("Rank of the element : "+rank);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
