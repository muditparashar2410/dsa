package com.question;

public class Dutch_Flag {
	public static void sortColors(int[] nums) {
        int low= 0 ; 
        int high= nums.length -1;
        int mid =0 ;
        while(mid<high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            if(nums[mid]==1){
                mid++;
            }
            if(nums[mid]==2){
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
	}
	public static void main(String[] args) {
		int arr[] = {2,0,2,1,1,0};
			sortColors(arr);
			for (int i : arr) {
				System.out.print(i+ " ");
			}
	}
}
