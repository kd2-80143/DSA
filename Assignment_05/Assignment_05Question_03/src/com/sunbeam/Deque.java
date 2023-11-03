package com.sunbeam;

public class Deque {
	public class Node 
	{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value)
		{
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public Deque()
	{
		head =  null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		if(isEmpty())
		{
			head = nn;
			tail = nn;
		}
		else
		{
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}
	
	public void addLast(int value)
	{
		Node nn = new Node(value);
		if(isEmpty())
		{
			head = nn;
			tail = nn;
		}
		else
		{
			nn.prev = tail;
			tail.next = nn;
			tail = nn;
			
		}
	}
	
	public void delFirst()
	{
		if(isEmpty())
		{
			System.out.println("Deque is empty");
		}
		else
		{
			head = head.next;
			head.prev = null;
		}
	}
	
	public void delLast()
	{
		if(isEmpty())
		{
			System.out.println("Deque is empty");
		}
		else
		{
			tail = tail.prev;
			tail.next = null;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");
		}
		else
		{
			Node trav = head;
			while(trav!=null)
			{
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
		}
	}
		
}
