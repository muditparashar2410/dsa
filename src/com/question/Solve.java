package com.question;

public class Solve {
	
	static long solve(int arr[],int n) {
		 long count= 0; // Initialize the count of special pairs

	        for (int i = 1; i <= n; i++) {
	            int j = arr[i - 1];
	            int k = arr[j - 1];

	            if (arr[arr[arr[i - 1] - 1] - 1] == arr[arr[arr[j - 1] - 1] - 1]) {
	                count++;
	            }
	        }
	        return count++;
	}
	
	public static void main(String[] args) {
		int arr[] = {4,2,1,2};
		System.out.println(solve(arr,arr.length));
	}
}
