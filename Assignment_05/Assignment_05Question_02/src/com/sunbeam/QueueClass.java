package com.sunbeam;

public class QueueClass {
	LinkedList l2;
	public QueueClass()
	{
		l2 = new LinkedList();
	}
	public boolean isEmpty()
	{
		return l2.isEmpty();
	}
	public void offer(int val)
	{
		l2.addFirst(val);
	}
	public void poll()
	{
		l2.delLast();
	}
	public void peek()
	{
		System.out.println("Peeked Data from Queue " + l2.getData());
	}
}
