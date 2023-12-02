package com.question;

public class RemoveElemant {
//	WRONG
	public static int removeElement(int[] nums, int val) {
        int left=0;
        int counter=0;
        int right=0;
        while(right<nums.length-counter){
            if(nums[left]==val){
                if(nums[right]!=val){
                    int temp=nums[right];
                    nums[right]=nums[left];
                    nums[left]=temp;
                    left++;
                    counter++;
                    right=left+1;
                }else{
                    right++;
      
                }
            }else{
                left++;
                right=left+1;
            }
        }
        return nums.length-counter;
    }
	public static void main(String[] args) {
		int arr []={3,3};
		System.out.println(removeElement(arr,3));
	}

}
