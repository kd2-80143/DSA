package com.sunbeam;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		List l1 = new List();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.addAtPosition(50, 3);
		l1.delAtPosition(3);
		
		l1.display();
	}

}
