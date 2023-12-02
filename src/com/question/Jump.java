package com.question;

public class Jump {
	static int maxValue(int arr[],int k) {
		int max=Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length;i++) {
			int maxsofar=0;
			for(int j = i ; j < arr.length;j+=k) {
				maxsofar += arr[j];
			}
			max = Math.max(maxsofar, max);
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {-2,-5,-4,-9};
		System.out.println(maxValue(arr,2));
	}

}
