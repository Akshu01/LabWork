package com.capg.lab9;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class Lab9_3 {
	
	public boolean Authenticator(String username,String password) {
		
		boolean userNamePattern = Pattern.matches("[a-zA-Z0-9]{6,12}", username);
		boolean passwordPattern = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
		if(userNamePattern && passwordPattern)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the user name:");
			String name = sc.next();
			System.out.println("Enter the password :");
			String password = sc.next();
			sc.close();
			Lab9_3 a = new Lab9_3();
			
			BiFunction<String,String,Boolean> result = (x,y) ->   a.Authenticator(name,password);
			boolean res =  result.apply(name,password);
			if(res)
				System.out.println("Authentication successful");
			else
				System.out.println("Authentication un-successful");
	}
}
