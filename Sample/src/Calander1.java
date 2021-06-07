// Program to demonstrate get() method 
// of Calendar class 

import java.util.*; 
public class Calander1 { 
	public static void main(String[] args) 
	{ 
		// creating Calendar object 
		Calendar calendar = Calendar.getInstance(); 
		
		// Demonstrate Calendar's get()method 
		System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR)); 
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE)); 
		System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE)); 
		System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND)); 
		
		// getMax() method
		int max = calendar.getMaximum(Calendar.DAY_OF_WEEK); 
        System.out.println("Maximum number of days in a week: " + max); 
          
        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR); 
        System.out.println("Maximum number of weeks in a year: " + max); 
        
     // getMin() method
        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK); 
        System.out.println("Minimum number of days in week: " + min); 
          
        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR); 
        System.out.println("Minimum number of weeks in year: " + min); 
        
        //Add() Method
        calendar.add(Calendar.DATE, -15); 
        System.out.println("15 days ago: " + calendar.getTime()); 
        calendar.add(Calendar.MONTH, 4); 
        System.out.println("4 months later: " + calendar.getTime()); 
        calendar.add(Calendar.YEAR, 2); 
        System.out.println("2 years later: " + calendar.getTime()); 
	} 
} 
