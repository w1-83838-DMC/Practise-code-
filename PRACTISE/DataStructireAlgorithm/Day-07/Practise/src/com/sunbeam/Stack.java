package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) // default constructor 
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	public void push(int value)
	{
		if(!isFull()) {
			// repositioning top 
			top++;
			// add value at top index 
			arr[top]= value;
		}else 
		{
			System.out.println("Stack is full");
			
		}
	}
	public int pop()
	{
		if(!isEmpty())
			//repositioning top 
			return arr[top--];
		else 
			System.out.println("Stack is Empty");
		return -1;
	}
	public int peek()
	{
		if(!isEmpty()) // not isEmpty means it contains element
			return arr[top];
		else 
			System.out.println("Stack is Empty ");
		return -1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	

}
