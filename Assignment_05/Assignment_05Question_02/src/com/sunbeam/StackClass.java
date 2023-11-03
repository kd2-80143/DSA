package com.sunbeam;

public class StackClass {
	LinkedList l1;
	public StackClass()
	{
		l1 = new LinkedList();
	}
	
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void push(int val)
	{
		l1.addFirst(val);
	}
	
	public void pop()
	{
		l1.delFirst();
	}
	
	public void peek()
	{
		System.out.println("Peek data from stack " + l1.getData());
	} 
}
