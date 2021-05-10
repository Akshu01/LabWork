package com.capg.lab6;
import java.util.*;

public class Lab6_3 {

	static HashMap<Integer,Integer> getSquares(int[] arr) {
		
		 HashMap<Integer,Integer> sq  = new HashMap<Integer, Integer>();
		 for(int i : arr) {
			  sq.put(i, (i*i));
		 }
		 return sq;
		
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
      HashMap<Integer,Integer> sqVal = getSquares(arr);
      for (Map.Entry<Integer,Integer>  entry : sqVal.entrySet()) {
    	  
          System.out.println(entry.getKey() + " " + entry.getValue()); 
      }
      sc.close();
	}

}
