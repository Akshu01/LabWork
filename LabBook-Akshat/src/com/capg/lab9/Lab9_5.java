package com.capg.lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Lab9_5 {

	public Integer Factorial(int n) {
        if(n==0 || n==1) {
                  return 1;
        }
        return n *  Factorial(n-1);
	}

	public static void   main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Lab9_5 cal = new Lab9_5();
   
		Function<Integer,Integer> result = (a) ->   cal.Factorial(n);
		System.out.println("By Using lambda expression: "+result.apply(n));

		Function<Integer,Integer> resultRef = cal::Factorial;
		System.out.println(" By Using method references : "+resultRef.apply(n));

	}

}
