package com.capg.Lab1;

import java.util.Scanner;

public class Lab1_3 {
	
	static boolean checkNumber(int n) {
		String checkNum = String.valueOf(n);
	    int len = checkNum.length();
	    for (int i = 0; i < len-1; i++) {
	        if(checkNum.charAt(i) <= checkNum.charAt(i+1)) {
	            continue;
	        } else {
	        	return false; 
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("Increasing number");
		} else {
			System.out.println("Not An Increasing number");
		}
		sc.close();
	}
}
