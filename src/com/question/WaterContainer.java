package com.question;

public class WaterContainer {
	 public static int maxArea(int[] height) {
	       int max = 0 ;
	       for(int i =0 ; i <  height.length ; i++){
	           int maxsofar=0;
	           for(int j =i ; j<height.length ; j++){
	               maxsofar=Integer.min(height[i],height[j]) * (j-i);
	               if(maxsofar>max){
	                   max=maxsofar;
	               }
	           }
	       }
	       return max; 
	    }
	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));


		
	}

}
