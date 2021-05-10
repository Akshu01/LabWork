package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_4 {
	
	static int[] modifyArray(int[] arr, int n) {
		Arrays.sort(arr);
		int j =0;
		int[] dupArr = new int[n];
		for(int i = 0; i<n-1;i++) {
				if(arr[i] != arr[i+1]) {
					dupArr[j] = arr[i];
					j++;
				}
		}
        dupArr[j] = arr[n-1];
        j++;
        return dupArr;
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
		int modArr[] = modifyArray(arr,n);
		System.out.println("Array without duplicates is: ");
		for(int i =modArr.length-1;i>=0;i--) {
			if(modArr[i]!=0)
			System.out.println(modArr[i]);
		}
        sc.close();
	}
}
