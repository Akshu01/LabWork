package com.capg.Lab1;

import java.util.Scanner;

public class Lab1_2 {
	static int calculateDifference(int n) {
		int sumSq = 0;
		int sumDiff = 0;
		for(int i =1;i<=n;i++) {
			sumSq += (i*i);
			sumDiff += i;
		}
		int val = sumSq - ((sumDiff)*(sumDiff));
		return val;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
		sc.close();
	}
}
