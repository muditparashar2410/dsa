package com.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

class Solution {
	public static int lengthOfLongestSubstring(String s) {
	        int max=0;
	        HashSet<Character> set = new HashSet<>();
	        int left=0;
	        int right=0;
	        int length = 0;
	        while(right<=s.length()-1){
	            if(set.contains(s.charAt(right))){
	            	set.remove(s.charAt(left));
	            	left++;
	            }else{
	            	set.add(s.charAt(right));
	            	right++;
	            }
	    length = right-left;
	    max=Math.max(length,max);
	    }
	    return max;
	    }
	public static void main(String[] args) {
		String a= "pwwkew";
		System.out.println(lengthOfLongestSubstring(a));
	}

}
