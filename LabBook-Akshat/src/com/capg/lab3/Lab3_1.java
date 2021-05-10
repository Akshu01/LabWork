package com.capg.lab3;

import java.util.Scanner;

public class Lab3_1 {
	
	static String getImage(String str) {
		
		String image = str +"|";
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		image += rev;
		return image;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		System.out.println((getImage(str)));
		sc.close();
	}
}
