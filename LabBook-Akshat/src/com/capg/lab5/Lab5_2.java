package com.capg.lab5;

import java.util.Scanner;

class NameException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NameException(String str) {
		System.out.println(str);
	}
}

public class Lab5_2 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String firstName = sc.nextLine();
		System.out.print("Enter the last name : ");
		String lastName = sc.nextLine();
		sc.close();
		try {
			if(firstName.isEmpty() || lastName.isEmpty()) {
				throw new NameException("The name is Invalid");
			} else {
				System.out.println("Valid name");
				}
		} catch (NameException e) {
				System.out.println(e);
		}
	
	}
}

