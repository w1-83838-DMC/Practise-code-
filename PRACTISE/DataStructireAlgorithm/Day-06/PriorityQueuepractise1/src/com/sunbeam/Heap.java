package com.sunbeam;

public class Heap {
	private int arr[];
	private int SIZE;
	public Heap(int size) {
		SIZE=0;
		arr=new int [size+1];
	}
	
	public void addHeap(int value)
	{
		// increase size of heap by 1
		SIZE++;
		// add value at first empty index 
		arr[SIZE]=value;
		// adjust position of newly added value by comparing it with all its acenstors 
		int ci=SIZE;
		int pi=ci/2;
		while(pi>=1)
		{
			// if child is already less than parent 
			if(arr[ci]<arr[pi])
				break;
			// if child is greate than parent then swap both parent and child 
			int temp=arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			// update parent and child index 
			ci=pi;
			pi=ci/2;
		}
	}
	public int  deleteHeap()
	{
		// take backup of root element (maximum element)
		int max=arr[1];
		// add last element of heap at root position 
		arr[1]=arr[SIZE];
		// decrease size of heap by 1
		SIZE--;
		// adjust position of root by comparising with all its descendents 
		int pi=1;
		int ci=pi*2;
		while(ci<=SIZE) {
			// find index of maximun child 
			if((ci+1)<=SIZE && arr[ci+1]> arr[ci])
				ci=ci+1;
			// if parent is greater than maximum child
			if(arr[pi]> arr[ci])
				break;
			// if parent is less than maximum child 
			int temp=arr[pi];
			arr[pi]=arr[ci];
			arr[ci]=temp;
			// update parent and child index 
			pi=ci;
			ci=pi*2;
		}
		return max;
	}
	public int getMax()
	{
		return arr[1];
	}
}
