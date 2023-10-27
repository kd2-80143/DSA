package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDesc {

	public static void insertsortdesc(int arr[], int N)
	{
		for(int i = 1; i < N; i++)
		{
			int j;
			int temp = arr[i];
			for(j=i-1; j >= 0 ;j--)
			{
				if(arr[j] < temp)
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
	}
	public static void main(String[] args) {
		int arr[] = {23,32,11,15,90,30,12};
		
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		insertsortdesc(arr, arr.length);
		System.out.println("Array after sorting : " + Arrays.toString(arr));
	}

}
