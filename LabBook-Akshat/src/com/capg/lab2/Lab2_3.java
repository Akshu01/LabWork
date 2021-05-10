package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_3 {
	
	static int[] getSorted(int arr[],int n) {
		String str = "";
		String[] rev = new String[n];
		
		for(int i =0;i<n;i++) {
			str = str + arr[i];
		}
		
		System.out.println("Reverse numbers are : ");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String s = sb.toString();
		System.out.println(s);
		rev = s.split("");
		Arrays.sort(rev);
		int[] x = new int[n];
		for(int i =0;i<n;i++) {
			x[i] = Integer.parseInt(rev[i]);
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sort[] = getSorted(arr,n);
		System.out.println("Sorted elements are : ");
		for(int i =0;i<n;i++) {
			System.out.println(sort[i]);
		}
		sc.close();
	}
}
