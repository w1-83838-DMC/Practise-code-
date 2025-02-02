package com.sunbeam;

import java.util.Arrays;

public class Merge {
	
	public static void mergeSort(int arr[], int left,int right)
	{
		//0. stop if partition is invalid or single element
		if(left>=right)
			return;
		// divide array into two partitons 
		int mid=(left+right)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		// merge sorted partitions into temp array such that temp array is sorted
		int length=right-left+1;
		int temp[]= new int[length];
		int i=left, j=mid+1,k=0;
		while(i<=mid && j<=right)
		{
			// compare ith and jth element
			if(arr[i]<arr[j]) {
				// add ith element into temp array
				temp[k]=arr[i];
				k++;
				i++;
			}else 
			{
				// add jth element into temp array
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		// if right partition is finished add remaining elements of left partition into temp array
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		// if left partions is finished add remaining elements of right partitions into temp array
		while(j<=right)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		// overwrite temp array into original array
		for(i=0; i<length; i++)
		{
			arr[left+i]=temp[i];
		}
	}

	public static void main(String[] args) {
		int arr[]= {6,1,9,7,3,2,8,5,4};
		System.out.println("Array Before sort: "+ Arrays.toString(arr));
		mergeSort(arr, 0,arr.length-1);
		System.out.println("Array After sort "+Arrays.toString(arr));
		
		
	}
	

}
