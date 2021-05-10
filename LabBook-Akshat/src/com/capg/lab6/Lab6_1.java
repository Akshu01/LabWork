package com.capg.lab6;

import java.util.*;
import java.util.HashMap;

public class Lab6_1 {
	
	public static ArrayList<String> getValues(HashMap<String,String> capitals) {
		
		//ArrayList<String> keyList = new ArrayList<String>(capitals.keySet());
		ArrayList<String> valueList = new ArrayList<String>(capitals.values());
        Collections.sort(valueList);
        return valueList;     
	}
	
	public static void main(String[] args) {
		
		 HashMap<String,String> capitals = new HashMap<>();        
	        capitals.put("India", "New Delhi");
	        capitals.put("US", "Washington DC");
	        capitals.put("UK", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("France", "Paris");

	        ArrayList<String> valueList = getValues(capitals);
	        System.out.println(valueList);
	        
	}

}
