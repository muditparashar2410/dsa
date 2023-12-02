package com.core.recursion;

public class Fibonacci {
	 static long[] Series(int N) {
	        long arr[] = new long[N+1];
	        if(N==1){
	            return arr; 
	        }
	        arr[0]=0;
	        arr[1]=1;
	        for(int i = 2 ; i < N ;i++){
	            arr[i] = arr[i-1]+arr[i-2];
	        }
	        return arr;
	    }
	public static void main(String[] args) {
		System.out.println(Series(5));
	}

}
