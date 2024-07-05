package com.sunbeam;

public class PriorityQueue {
	private Heap h;
	private int SIZE;
	public PriorityQueue(int size)
	{
		SIZE=size;
		h=new Heap(SIZE);
	}
	public void push(int value)
	{
		h.addHeap(value);
	}
	public int pop()
	{
		return h.deleteHeap();
	}
	public int peek()
	{
		return h.getMax();
	}
	

}
