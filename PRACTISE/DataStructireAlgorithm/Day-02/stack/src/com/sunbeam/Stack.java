package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private int SIZE;
	
	public Stack(int size)
	{
		SIZE=size;
		arr= new int[SIZE];
		top=-1; // intially top is -1
	}
	public void push(int value)
	{
		if(!isFull())
		{
			// a reposition to the top
			top++;
			arr[top]= value;
		}else 
		{
			System.out.println("Stack is full ");
		}
	}
	public int pop()
	{
		if(!isEmpty())
		// repostion to the top --
			return arr[top--];
		else 
			System.out.println("Stack is Empty ");
		return -1;
		
	}
	public int  peek()
	{
		if(!isEmpty())
			return arr[top];
		else 
			System.out.println("Stack is Empty ");
		return -1;
	}
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	
}
