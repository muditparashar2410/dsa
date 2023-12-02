package com.sorting;

public class InsertionSort {

	private static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int ele=arr[i];
				int j;
			for(j=i;j>0;j--) {
				arr[j]=arr[j-1];
				if(arr[j]<ele) {
					break;
				}
			}
			arr[j]=ele;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		InsertionSort.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}


}
