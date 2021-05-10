package com.capg.lab5;

import java.util.Scanner;

class AgeLimitException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AgeLimitException(String str) {
		System.out.println(str);
	}
}

public class Lab5_1 {
 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the user's age : ");
		int age = sc.nextInt();
		sc.close();
		try {
			if(age < 15) {
				throw new AgeLimitException("The Age is Invalid");
			} else {
    	System.out.println("Valid age");
			}
		} catch (AgeLimitException e) {
			System.out.println(e);
		}
	}
}

