package com.dynamicprogramming;

import utils.RuntimeComplexity;

import java.util.Arrays;

public class Fibonacci {

    private int bestApproach(int n){
        int prev2=0;
        int prev =1;
        for(int  i =2; i <= n ; i++){
            int curr_i = prev2+prev;
            prev2 = prev;
            prev = curr_i;
        }
        return prev;
    }
    public static void main(String[] args) {
        RuntimeComplexity.start();
        int n =45;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        Fibonacci f = new Fibonacci();
        System.out.println(f.bestApproach(n));
//        System.out.println(f.fib(n,dp));
        RuntimeComplexity.stop();
    }
    // * recursive code
    // int fib(int n,int[] dp){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     if(dp[n]!=-1) return dp[n];
    //     return fib(n-1,dp)+fib(n-2,dp);
    // }
    int fib(int n , int dp[]){
        for(int i =2; i <=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
