package com.core.recursion;

public class Palindrome_string {
	static boolean palindrome(String S,int l,int r) {
//		if(l>=r) {
//			return true;
//		}
//		if(s.charAt(l)!=s.charAt(r)) {
//			return false;
//		}
//		return palindrome(s, l+1, r-1);
		int arr[] = new int[256];
		for(int i = 0 ; i < S.length();i++){
		            if(arr[S.charAt(i)]==0){
		                arr[S.charAt(i)] =1;
		        }else{
		                arr[S.charAt(i)] -=1;
		            
		            }
		        }
		        for(int j = 0 ;  j < S.length() ; j++){
	            if(arr[S.charAt(j)]!=0 && arr[S.charAt(j)]!=1 ){
		                return false ;
		        }
		         
		            }
		         return true;
	}
	public static void main(String[] args) {
		String s = "geeksogeeks";
		System.out.println(palindrome(s,0,3));

	}

}
