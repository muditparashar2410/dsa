package com.mix;

public class mixpractice {
    static void reverseanarray(int[]a){
        for(int i = 0 ; i < a.length/2 ; i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        reverseanarray(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
