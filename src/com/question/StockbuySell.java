package com.question;

import java.util.Arrays;

public class StockbuySell {
	public static int minimumMagic(int n, int m, int price[], int magical_price[]){
        int diff[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            diff[i] = price[i]-magical_price[i];
        }
        Arrays.sort(diff);
        int cost=0;
        int count=0;
        for(int i = n-1;i>=0;i--){
            if(diff[i] <=m ){
                m-=diff[i];
                count++;
            }
            if(m<=0){
            	return -1;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
	int []arr1= {3, 4, 6 ,2 ,4};
	int m= 13;
			int []arr2= {1 ,2 ,5, 1, 3};
	System.out.println(minimumMagic(arr1.length, m, arr1, arr2));
	
	}

}
