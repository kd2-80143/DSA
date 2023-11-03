package com.sunbeam;

public class List {
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
	
	public List()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
			//e. move head on newnode
			head = nn;
		}
	}
	
	public void addAtPosition(int value, int pos)
	{
		Node nn = new Node(value);
		if(isEmpty())
		{
			head = nn;
			head.prev = nn;
			head.next = nn;
		}
		else
		{
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
			{
				trav = trav.next;
			}
			nn.next = trav;
			nn.prev = trav.prev;
			trav.prev.next = nn;
			trav.prev = nn;
		}
	}
	
	public void delAtPosition(int pos)
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			Node trav = head;
			for(int i = 1; i < pos ; i++)
			{
				trav = trav.next;
			}
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			return;
		}
		Node trav = head;
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}while(trav!=head);
		System.out.println("");
		
	}
	
}
