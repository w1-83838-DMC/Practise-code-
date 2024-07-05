package com.sunbeam;

import java.util.Arrays;

public class Quicksort {
	public static void quicksort(int arr[],int left,int right)
	{
		// 0. stop if single element partition or invalid 
		if(left>=right)
			return;
		// 1. decide one reference/pivot/axis element from array
		//int pivot = arr[left];
		// 2. arrange all smaller elements than pivot on left side of the pivot 
		// 3. arrange all greater elements than pivot on right side of the pivot 
		int i=left, j=right;
		while(i<j)
		{
			// find elements greater than pivot from left side 
			for(;i<=right && arr[i]<=arr[left]; i++);
			// find element less or equal to pivot from right side 
			for(;arr[j]> arr[left]; j--);
			// if i and j are not crossed then swap ith and jth element
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		// if i and j are croosed then swap pivot add jth element 
		int temp=arr[j];
		arr[j]=arr[left];
		arr[left]=temp;
		
		
		// sort left and right partitions of pivot individuals by same method 
		quicksort(arr, left, j-1);
		quicksort(arr, j+1, right);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {66,33,99,11,77,22,55,66,88};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		quicksort(arr, 0, arr.length-1);
		System.out.println("Array After sort : "+ Arrays.toString(arr));
	}

}
