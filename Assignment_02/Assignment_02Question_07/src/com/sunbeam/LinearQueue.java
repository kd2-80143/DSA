package com.sunbeam;

public class LinearQueue {
	private int arr[];
	private final int SIZE;
	private int front , rear;
	public LinearQueue(int size) {
		SIZE = size;
		this.arr = new int[SIZE];
		this.front = 0;
		this.rear = 0;
	}
	
	public void push(int data) {
		arr[rear] = data;
		rear++;
	}
	
	public void pop() {
		int item = arr[front];
		arr[front] = 0;
		front = (front + 1) % SIZE;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
}
