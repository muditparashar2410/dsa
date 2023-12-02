package com.question;

public class VolksWagen {

	public static void main(String[] args) {
	System.out.println(reverse("mudit"));
	}

	private static String reverse(String s) {
		StringBuffer buf = new StringBuffer();
		for(int i = s.length()-1 ; i >=0;i--){
			buf =buf.append(s.charAt(i));
		}
		return buf.toString() ;
	}
}
