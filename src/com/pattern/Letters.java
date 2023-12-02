package com.pattern;

public class Letters {
	
	static void pattern(int n) {
		int row=1;
		int nst=1;
		int assci  = 65;
		while(row<=n) {
			for(int cst=1 ; cst <= nst;cst++) {
				System.out.print((char)assci);
			}
			System.out.println();
			row++;
			nst++;
			assci++;
		}
	}
	
	public static void main(String[] args) {
		pattern(27);
	}
}
