package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		
		l1.displayList();
		
		int mid = l1.findMiddleElement();
		System.out.println("Middle Element : " + mid);
		
		

	}

}
