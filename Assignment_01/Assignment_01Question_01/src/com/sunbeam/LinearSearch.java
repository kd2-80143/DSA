package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int size, int key) {
		for(int i = 0; i < size; i++)
		{
			if(key==arr[i])
			{
				return i+1;
			}
		}
		return size;
	}
	public static void main(String[] args) {
		int arr[] = {66,43,32,10,15,22,30,66,33,30};
		
		int key;
		System.out.println("Enter element to search ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		int index = linearSearch(arr,arr.length,key);
		if(index!=arr.length)
		{
			System.out.println("Number of comparisons : " +index);
		}
		else
		{
			System.out.println("Number of comparisons : "  + index);
		}

	}

}
