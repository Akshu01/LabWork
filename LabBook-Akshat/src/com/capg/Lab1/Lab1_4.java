package com.capg.Lab1;

import java.util.Scanner;

public class Lab1_4 {
	static boolean checkNumber(int n) {
		int k = 0;
		for(int i = 0; i<=n/2; i++) {
			double a  = (Math.pow(2, i));
			if(a == n) {
				k =1;
			}
		}
		if(k==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("In Power of 2");
		} else {
			System.out.println("Not In Power of 2");
		}
		sc.close();
	}
}
