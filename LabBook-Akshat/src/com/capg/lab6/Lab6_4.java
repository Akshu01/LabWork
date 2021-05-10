package com.capg.lab6;

import java.util.HashMap;
import java.util.Map;

public class Lab6_4 {
	
	static HashMap<String,String> getStudents(HashMap<String,Integer> students) {
		
		HashMap<String,String> scholarship = new HashMap<String,String>();
		for (Map.Entry<String,Integer>  entry : students.entrySet()) { 
	          if(entry.getValue()>=90)
	        	  scholarship.put(entry.getKey(), "Gold");
	          else if(entry.getValue()>=80 && entry.getValue()<90)
	        	  scholarship.put(entry.getKey(), "Silver");
	          else if(entry.getValue()>=70 && entry.getValue()<80)
	        	  scholarship.put(entry.getKey(), "Bronze");
	          else
	        	  scholarship.put(entry.getKey(), null);
	      }
		return scholarship;
	}

	public static void main(String[] args) {
		 HashMap<String,Integer> students = new HashMap<>();        
	        students.put("Akshat_CS17019", 85);
	        students.put("Udit_CS17020", 60);
	        students.put("Shivam_CS17021", 80);
	        students.put("Dheeraj_CS17022", 90);
	        students.put("Mridul_CS17023", 70);
	        
	        HashMap<String,String> val = getStudents(students);
	        for (Map.Entry<String,String>  entry : val.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        }
	}

}
