package com.sunbeam;

import java.util.Scanner;

public class Tester {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("0. EXIT");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("*****************************");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Stack st = new Stack(4);
		int ch;
		Scanner sc = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(st.isFull())
				{
					System.out.println("Stack is full");
				}
				else
				{
					System.out.println("Enter the element to push");
					int data1 = sc.nextInt();
					st.push(data1);
				}
			break;
			case 2:
				if(st.isEmpty())
				{
					System.out.println("Stack is empty");
				}
				else
				{
					int data = st.pop();
					System.out.println("Element popped " + data);
				}
			break;
			case 3:
				if(st.isEmpty())
				{
					System.out.println("Stack is empty");
				}
				else
				{
					System.out.println("Element on top " + st.peek());
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
