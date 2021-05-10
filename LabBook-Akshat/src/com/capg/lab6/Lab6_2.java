package com.capg.lab6;

import java.util.*;

class Lab6_2 {
	
    static HashMap<Character,Integer> countChars(char[] arr) { 
 
        HashMap<Character,Integer> characterCount = new HashMap<Character, Integer>(); 
   
        for (char ch : arr) { 
            if (characterCount.containsKey(ch)) { 
            	characterCount.put(ch, characterCount.get(ch) + 1); 
            } else { 
            	characterCount.put(ch, 1); 
            } 
        } 
        return characterCount;
    } 
  
    public static void main(String[] args) {
    	
        String str = "aaaaaaaaaaaaaaaaa";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> m = countChars(arr);
        for (Map.Entry<Character,Integer>  entry : m.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
} 
