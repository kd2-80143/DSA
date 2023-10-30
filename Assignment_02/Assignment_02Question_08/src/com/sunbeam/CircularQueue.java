package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private final int SIZE;
	private int front;
	private int rear;
	private int count;
	
	public CircularQueue(int size)
	{
		SIZE = size;
		front = -1;
		rear = -1;
		arr = new int[SIZE];
		count = 0;
	}
	
	public void push(int data) 
	{
		rear = (rear+1)%SIZE;
		arr[rear] = data;
		count++;
	}
	
	public void pop() {
		front = (front+1)%SIZE;
		if(front == rear)
		{
			front = rear = -1;
		}
		count--;
	}
	
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	
	public boolean isFull() {
		//return (rear==front && rear != -1) || (front ==-1 && rear==SIZE-1);
		return count==SIZE;
	}
	
	public boolean isEmpty() {
		//return rear==front && rear==-1;
		return count == 0;
	}
	
}

