package com.sunbeam;

public class MainClass {

	public static void main(String[] args) {
		StackClass st = new StackClass();
		st.push(10);
		st.push(20);
		st.push(30);
		st.peek();
		st.pop();
		st.peek();
		
		QueueClass q = new QueueClass();
		q.offer(11);
		q.offer(22);
		q.offer(33);
		q.offer(44);
		q.peek();
		q.poll();
		q.peek();
		q.poll();
		q.peek();

	}

}
