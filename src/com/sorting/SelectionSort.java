package com.sorting;

public class SelectionSort {
	static void sort(int arr[]) {
		for(int i = 0 ; i < arr.length;i++) {
			int min = i ;
			for(int j=i; j < arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		SelectionSort.sort(arr);
		for(int i :arr) {
			System.out.print(i+" ");
		}
	}

}
