package com.recursion;

public class Power {
	static int pow(int x, int n) {
		if (n == 0)
			return 1;
		return x * pow(x, n - 1);
	}

//	O(log n)
	static int optimiszedpow(int x, int n) {
		if (n == 0)
			return 1;

		int halfpower = optimiszedpow(x, n / 2);
		int halfpowersq = halfpower * halfpower;
		if (n % 2 != 0) {
			halfpowersq = x * halfpowersq;
		}
		return halfpowersq;
	}

	public static void main(String[] args) {
		System.out.println(optimiszedpow(2, 5));

	}

}
