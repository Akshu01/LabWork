package com.capg.Lab1;
import java.util.*;

public class Lab1_1 {
	static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int k = calculateSum(n);
		System.out.println(k);
		sc.close();
	}
}
