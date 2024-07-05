package com.sunbeam;

public class PriorityQueueMain {
	public static void main(String[] args) {
		PriorityQueue q= new PriorityQueue(9);
		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
		
		System.out.println("peeked value "+q.peek());
		System.out.println("Poped Value "+ q.pop());
		System.out.println("Peeked Value "+ q.peek());
		System.out.println("Poped Value "+ q.pop());
		System.out.println("Poped value "+ q.pop());
		System.out.println("Peeked Value "+q.peek());
	}

}
