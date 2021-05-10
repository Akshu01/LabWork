package com.capg.lab3;

import java.util.Scanner;

public class Lab3_3 {
	
	static int modifyNumber(int num) {
		
		StringBuffer sb = new StringBuffer();
		String str = "" + num;
		char arr[] = str.toCharArray();
		for(int i = 0;i < str.length()-1;i++) {
				int k = arr[i] - arr[i+1];
				if(k < 0) {
					k = -(k);
					sb.append(k);
				} else {
					sb.append(k);
				}
		}
		sb.append(arr[str.length()-1]);
		String s = sb.toString();
		int res = Integer.parseInt(s);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number");
		int num = sc.nextInt();
		System.out.println((modifyNumber(num)));
		sc.close();
	}

}
