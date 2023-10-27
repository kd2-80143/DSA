package com.sunbeam;

import java.util.Scanner;

public class Tester {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("********************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		
		int ch;
		Scanner sc = new Scanner(System.in);
		LinearQueue lq = new LinearQueue(5);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(lq.isFull())
				{
					System.out.println("Queue is full");
				}
				else {
					System.out.println("Enter the element to push");
					int ele = sc.nextInt();
					lq.push(ele);
				}
			break;
			case 2:
				if(lq.isEmpty())
				{
					System.out.println("Queue is empty");
				}
				else
				{
					lq.pop();
				}
			break;
			case 3:
				if(lq.isEmpty())
				{
					System.out.println("Queue is empty");
				}
				else
				{
					int ele1 = lq.peek();
					System.out.println("Element on top " + ele1);
				}
			break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
		System.out.println("Thank you for using our application");
	}

}
