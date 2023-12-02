package com.question;

public class KthsmallestElement {
    static int count(int[] nums, int mid)
    {
        // function to calculate number of elements less
        // than equal to mid
        int cnt = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] <= mid)
                cnt++;

        return cnt;
    }
    public static int kthSmallest(int[] nums, int l, int r, int k)
    {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        // calculate minimum and maximum the array.
        for (int i = 0; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }
        // Our answer range lies between minimum and maximum
        // element of the array on which Binary Search is
        // Applied
        while (low < high) {
            int mid = low + (high - low) / 2;
            /*if the count of number of elements in the
              array less than equal to mid is less than k
              then increase the number. Otherwise decrement
              the number and try to find a better answer.
            */
            if (count(nums, mid) < k)
                low = mid + 1;

            else
                high = mid;
        }

        return low;
    }
    public static void main(String[] args) {
     int num[] = { 1, 4, 5, 7, 19, 3};
        System.out.println(kthSmallest(num,0, num.length, 3));
    }
}
