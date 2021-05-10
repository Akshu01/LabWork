package com.capg.lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Lab9_2 
{
	public String Format(String str) {
		
		String formatted = "";
		for(int i=0;i<str.length();i++) {
			formatted += str.charAt(i) + " ";
		}
		return formatted;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be modified :");
		String s = sc.next();
		sc.close();
		Lab9_2 sf = new Lab9_2();
		Function<String,String> str = x -> sf.Format(s);
		String result = str.apply(s);
		System.out.println("Formatted String is :" +result);
	}

}
