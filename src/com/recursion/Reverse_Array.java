package com.recursion;

public class Reverse_Array {

    private static void reverse(int[] arr, int s , int l) {
        if(s>=l){
            return;
        }
        int temp = arr[s];
        arr[s]=arr[l];
        arr[l] = temp;
        reverse(arr,s+1,l-1);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverse(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
