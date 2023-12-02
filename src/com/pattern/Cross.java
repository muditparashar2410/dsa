package com.pattern;

public class Cross {
	static void pattern(int n) {
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row < 2*n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if(cst==1 || cst==nst) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			row++;
			if(row<=n) {
			nsp++;
			nst--;
			}else {
				nsp--;
				nst++;
			}
		}
	}

	public static void main(String[] args) {
		pattern(5);
//		System.out.println(3/2);
	}

}
