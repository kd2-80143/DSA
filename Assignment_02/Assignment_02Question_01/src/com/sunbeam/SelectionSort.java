package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static int selectionsort(int arr[],int N)
	{
		int count = 0;
		//1. count number of passes
		for(int i = 0 ; i < N-1; i++ )
		{
			//2. select one position from from array - i
			//3. compare ith element with all other elements (on right side)
			for(int j = i+1; j < N ; j++)
			{
				count++;
				//3.1 If selected element is greater than other element then swap
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {44,11,55,22,66,33};
		
		System.out.println("Array before sorting " + Arrays.toString(arr));
		int count = selectionsort(arr,arr.length);
		System.out.println("Number of comparisons : " +count);
		System.out.println("Array after sorting " + Arrays.toString(arr));

	}

}
