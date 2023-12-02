package com.question;

public class Tram {
	static long solve(int N, int start, int finish, int[] ticketCost) {
		if (start > finish) {
			int temp = start;
			start = finish;
			finish = temp;
		}
		int clockwiseCost = 0;
		for (int i = start; i < finish; i++) {
			clockwiseCost += ticketCost[i-1];
		}
		int antiClockwiseCost = 0;
		for (int i = 0; i < start-1; i++) {
			antiClockwiseCost += ticketCost[i];
		}
		for (int i = finish; i < N ; i++) {
			antiClockwiseCost += ticketCost[i-1];
		}
		antiClockwiseCost += ticketCost[N - 1];
		long totalCost = Math.min(clockwiseCost, antiClockwiseCost);
		return totalCost;
	}

	public static void main(String[] args) {
		int N = 4;
		int start = 1;
		int finish = 3;
		int[] ticketCost = { 1, 2, 3, 4 };
		long minCost = solve(N, start, finish, ticketCost);
		System.out.println("Minimum cost to travel from station " + start + " to station " + finish + ": " + minCost);
	}

}
