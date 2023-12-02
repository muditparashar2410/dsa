package com.question;

import java.util.HashMap;
import java.util.HashSet;

public class Agoda {
	public static boolean isprime(int n) {
	    if (n < 2) {
	        return false;
	    }
	    if (n == 2 || n == 3) {
	        return true;
	    }
	    if (n % 2 == 0 || n % 3 == 0) {
	        return false;
	    }

	    int sqrtN = (int) Math.sqrt(n) + 1;
	    for (int i = 5; i < sqrtN; i += 6) {
	        if (n % i == 0 || n % (i + 2) == 0) {
	            return false;
	        }
	    }

	    return true;
	}
	public static int solve(int N, String S) {
        int bots=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 1 ; i < S.length();i++){
            if(map.containsKey(S.charAt(i-1))){
            	map.put(S.charAt(i), map.get(S.charAt(i)+1));
            }else {
            	map.put(S.charAt(i-1), 1);
            }
            int sum = 0;
            for (Integer value : map.values()) {
                if (value != null) {
                    sum += value;
                }
            }
            if(i%2==0){
                if (i % 2 == 0 && isprime(sum)) {
                bots++;
            }
            }
        }
        return bots;
    }
	public static void main(String[] args) {
		String s = "aabagh";
		System.out.println(solve(s.length(), s));
	}
}
