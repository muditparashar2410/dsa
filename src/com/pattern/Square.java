package com.pattern;

public class Square {
//	Dry run this next time you visit here
	static void square(int n) {
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				int minBoundary = row;
				if (n - row + 1 < minBoundary) {
					minBoundary = n - row + 1;
				}
				if (col < minBoundary) {
					minBoundary = col;
				}
				if (n - col + 1 < minBoundary) {
					minBoundary = n - col + 1;
				}

				int value = n - minBoundary + 1;
				System.out.print(" " + value + " ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void main(String[] args) {
		square(6);
	}

}
