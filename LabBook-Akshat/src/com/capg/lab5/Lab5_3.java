package com.capg.lab5;

import java.util.Scanner;

class EmployeeException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public EmployeeException(String str) {
		System.out.println(str);
	}
}

public class Lab5_3 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee's salary : ");
		int salary = sc.nextInt();
		sc.close();
		try {
			if(salary < 3000) {
				throw new EmployeeException("Employee salary too low");
			} else {
				System.out.println("Acceptable Salary");
			}
		} catch (EmployeeException e) {
			System.out.println(e);
		}

	}
}

