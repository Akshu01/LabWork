package com.capg.lab3;

import java.util.Scanner;

public class Lab3_2 {
	
	static String alterString(String str) {
		
		char[] arr = str.toCharArray();
		String altstr = "";
		for(int i = 0;i<str.length();i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' 
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				altstr += arr[i];
			} else {
				char x = (char)(str.charAt(i) + 1);
				altstr += x ;
			}
		}
		return altstr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.next();
		System.out.println((alterString(str)));
		sc.close();
	}
}
