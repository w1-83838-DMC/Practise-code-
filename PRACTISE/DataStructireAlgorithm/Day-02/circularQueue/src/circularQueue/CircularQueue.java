package circularQueue;

public class CircularQueue {
	private int arr[];
	private int front,rear;
	private final int SIZE;
	
	public CircularQueue(int size)
	{
		SIZE=size;
		arr= new int[SIZE];
		front=rear=-1;
	}
	public void push(int value)
	{
		// 1. Reposition rear 
		rear=(rear+1)%SIZE;
		// 2. Add the Value 
		arr[rear]=value;
	}
	public int pop()
	{
		int temp= arr[(front+1)%SIZE];
		// 1.reposition front 
		front=(front+1)%SIZE;
		// if front and rear are equal then set both as -1 
		if(front==rear)
			front=rear=1;
		return temp;
	}
	
	public int peek()
	{
		// 1. read and return data of front+1 index
		return arr[(front+1)%SIZE];
	}
	public boolean isEmpty()
	{
		return front==rear && rear==-1;
	}
	public boolean isFull()
	{
		return (front==-1 && rear==SIZE-1)|| (front==rear && rear !=-1);
				
	}
}
