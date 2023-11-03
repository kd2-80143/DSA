package com.sunbeam;

public class LinkedList {
	class Node {
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void delFirst()
	{
		if(isEmpty())
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			head = head.next;
		}
	}
	
	public void delLast()
	{
		if(isEmpty())
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			Node trav = head;
			while(trav.next.next!=null)
			{
				trav =  trav.next;
			}
			trav.next = null;
		}
		
	}
	public int getData() {
		return head.data;
	}
}
