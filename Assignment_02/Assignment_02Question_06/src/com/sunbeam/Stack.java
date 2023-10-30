package com.sunbeam;

public class Stack {
	private int arr[];
	private int SIZE;
	private int top;


public Stack(int size)
{
	SIZE = size;
	arr = new int[5];
	top = SIZE;
}

public void push(int data)
{
	top--;
	arr[top] = data;
}

public int pop()
{
	int data = arr[top];
	top++;
	return data;
}

public int peek()
{
	return arr[top];
}

public boolean isFull()
{
	return top==0;
}

public boolean isEmpty()
{
	return top == SIZE;
}
}

