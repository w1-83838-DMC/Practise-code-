package com.sunbeam;

public class Queue {
	private int arr[];
	private int front,rear;
	private final int SIZE;
	
	public Queue(int size)
	{
		SIZE=size;
		arr= new int[SIZE];
		front=rear=-1;
	}
	public void push(int value)
	{
		//1.Reposition rear
		rear=rear+1;
		arr[rear]=value;
	}
	
	public int pop()
	{
		int temp=arr[front+1];
		// 1.reposition front 
		front=front+1;
		return temp;
	}
	public int peek ()
	{
		// read and return data of format+1
		return arr[front+1];
	}
	public boolean isEmpty()
	{
		return rear==front;
	}
	public boolean isFull()
	{
		return rear==SIZE-1;
	}
}
