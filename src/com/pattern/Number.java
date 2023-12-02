package com.pattern;

public class Number {
	static void number(int n) {
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
			System.out.print("  ");	
			}
			int count=1;
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(count);
				count=count * (row-cst)/cst;
				System.out.print("    ");
			}
			System.out.println();
			nsp-- ;
			nst++;
			row++;
		}
	}
	public static void main(String[] args) {
		number(5);
	}

}
