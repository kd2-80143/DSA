package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		
		Scanner sc = new Scanner(System.in);
		int data;
		System.out.println("Enter element to push : ");
		
		while(!st.isFull())
		{	
			data = sc.nextInt();
			st.push(data);
		}
		
		int max = 0;
		for(int i = 0; i < 5 ; i++)
		{
			if(st.peek() > max)
			{
				max = st.peek();
			}
			st.pop();
		}
		System.out.println("Maximum element : " + max);
	}

}
