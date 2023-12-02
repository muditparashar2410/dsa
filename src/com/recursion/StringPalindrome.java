package com.recursion;

public class StringPalindrome {


    public static void main(String[] args) {
        String s= "12321";
        if(isPalindrome(s,0)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }

    private static boolean isPalindrome(String s,int i) {
    if(s.length()==i){
        return false;
    }
    return s.charAt(i) == s.charAt(s.length() - i - 1);
    }
}
