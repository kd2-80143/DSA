package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Stack st = new Stack(8);
		int arr[] = {10,20,30,40,50};
		System.out.println("Original Array : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length ; i++)
		{
			st.push(arr[i]);
		}
		
		while(!st.isEmpty())
		{
			System.out.print(" "+ st.pop());
		}
	}

}
