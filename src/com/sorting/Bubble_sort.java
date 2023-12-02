 package com.sorting;

public class Bubble_sort {

	static void sort(int[] arr) {
		for(int i = arr.length-1;i>0;i--) {
			for(int j = 0 ; j < i ; j ++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
}
