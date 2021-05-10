package com.capg.lab6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Lab6_6 {
	
	public static ArrayList<Integer> votersList(HashMap<Integer,String> list) throws Exception {
		
		ArrayList<Integer> voteList = new ArrayList<Integer>();
		
		 for (Map.Entry<Integer,String>  entry : list.entrySet()) { 
			  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		      Date date = formatter.parse(entry.getValue());
		      Instant instant = date.toInstant();
		      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		      LocalDate givenDate = zone.toLocalDate();
		      Period period = Period.between(givenDate, LocalDate.now());
		       if(period.getYears()>=18) {
		    	   voteList.add(entry.getKey());
		       }
	      }
		 return voteList;	 
	}
        
	public static void main(String[] args) throws Exception {
		 HashMap<Integer,String> list = new HashMap<>();        
	        list.put(1,"10-01-2000");
	        list.put(2,"12-02-2005");
	        list.put(3,"18-03-1998");
	        list.put(4,"20-01-2010");
	        list.put(5,"24-11-1998");

	        ArrayList<Integer> valueList = votersList(list);
	        System.out.println(valueList);
	}
}
