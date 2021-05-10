package com.capg.lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Lab9_1 {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Double> result = (x,y) -> {
			double res = Math.pow(x,y);
			return res;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x value :");
		int x = sc.nextInt();
		System.out.println("Enter the y value :");
		int y = sc.nextInt();
		sc.close();
		double powerResult = result.apply(x,y);
		System.out.println(powerResult);
	}

}
