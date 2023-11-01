package com.sunbeam;

public class List {
	class Node {
		private int data;
		private Node next;
	
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private Node head;
	
	
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return tail == null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
		else
		{
			newnode.next =  tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		
	}
	
	public void delFirst()
	{
		tail.next = tail.next.next;
	}
	
	public void delLast()
	{
		
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		
		else if(tail.next==null)
		{
			tail = null;
		}
		else
		{
			Node trav = tail.next;
			while(trav.next.next!=tail.next)
			{
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}
	public void displayList()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		
		else
		{
			Node trav = tail.next;
		    do
			{
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			while(trav!=tail.next);
		}
		System.out.println("");
	}
	
}
