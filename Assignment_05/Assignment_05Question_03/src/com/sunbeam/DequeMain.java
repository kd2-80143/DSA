package com.sunbeam;

public class DequeMain {

	public static void main(String[] args) {
		Deque dq = new Deque();
		
		dq.addFirst(40);
		dq.addFirst(30);
		dq.addFirst(20);
		dq.addLast(10);
		dq.addLast(50);
		dq.addFirst(60);
		dq.addLast(70);
		
		dq.delFirst();
		dq.delLast();
		dq.delFirst();
		dq.delLast();
		
		dq.display();

	}

}
