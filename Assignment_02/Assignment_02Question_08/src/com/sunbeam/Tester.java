package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************");
		System.out.println("0. EXIT");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("**********************");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int ch;
		CircularQueue cq = new CircularQueue(5);
		Scanner sc = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(cq.isFull())
				{
					System.out.println("Queue is full");
				}
				else
				{
					System.out.println("Enter data ");
					int data = sc.nextInt();
					cq.push(data);
				}
			break;
			case 2:
				if(cq.isEmpty())
				{
					System.out.println("Queue is empty");
				}
				else
				{
					cq.pop();
				}
			break;
			case 3:
				if(cq.isEmpty())
				{
					System.out.println("Queue is empty");
				}
				else
				{
					System.out.println("Peeked Data : " + cq.peek());
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
