package com.capg.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_5 {

	static int getSecondSmallest(int arr[],int n) {
		Arrays.sort(arr);
		return arr[1];
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
		
		System.out.println("Second smallest element is: ");
		System.out.println(getSecondSmallest(arr,n));
		sc.close();
	}
}
