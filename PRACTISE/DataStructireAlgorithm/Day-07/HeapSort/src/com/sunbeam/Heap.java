package com.sunbeam;

public class Heap {
	private int SIZE;
	public Heap()
	{
		SIZE=0;
	}
	public void addHeap(int arr[])
	{
		// increase size of heap by 1
		SIZE++;
		// adjust position of newly added value by comparing it with all its ancestors 
		int ci=SIZE;
		int pi=ci/2;
		while(pi>=1)
		{
			// if child is already less than parent 
			if(arr[ci]<arr[pi])
				break;
			// if child is greater than parent then swap both parent and child 
			int temp= arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			
			// update parent and child index 
			ci=pi;
			pi=ci/2;
		}
	}
	
	

	public int deleteHeap(int arr[])
	{
		// 1. swap first and last element of heap 
		int max= arr[1];
		arr[1]=arr[SIZE];
		arr[SIZE]=max;
		// decrease size of heap by 1
		SIZE--;
		// adjust position of root by comparing with all its descendents 
		int pi=1;
		int ci=pi*2;
		while(ci<=SIZE)
		{
			// find index of maximum child 
			if((ci + 1)<=SIZE && arr[ci+1]>arr[ci])
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
	
	public void heapSort(int arr[])
	{
		// convert arr into heap
		for(int i=1; i<arr.length; i++)
			addHeap(arr);
		for(int i=1; i<arr.length; i++)
			deleteHeap(arr);
	}

}
