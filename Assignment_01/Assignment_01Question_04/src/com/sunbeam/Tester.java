package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int findnthOccurence(int[] arr, int size, int key, int n) {
		int count=0;
		for(int i = 0 ; i < size ; i++ )
		{
			if(key==arr[i])
			{
				count++;
				if(count == n)
				{
					return i;
				}
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,10,30,40,10,20,30,40,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search");
		int key = sc.nextInt();
		System.out.println("Enter which occurence to find");
		int n = sc.nextInt();
		
		int index = findnthOccurence(arr,arr.length,key,n);
		System.out.println("Occurence : " +index);

	}

	

}
