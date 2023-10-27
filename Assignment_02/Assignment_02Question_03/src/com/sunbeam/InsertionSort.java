package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionsort(int arr[], int N)
	{
		int count = 0;
		for (int i = 1 ; i< N ; i++)
		{
			int temp = arr[i];
			int j;
			for(j = i-1; j >= 0; j--)
			{
				count++;
				if(arr[j] > temp)
				{
					arr[j+1] = arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1] = temp;
		}
		System.out.println("Number of comparisons : " +count);
	}
	public static void main(String[] args) {
		int arr[] = {55,44,22,66,11,33};
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		insertionsort(arr, arr.length);
		System.out.println("Array after sorting : " + Arrays.toString(arr));
	}

}
