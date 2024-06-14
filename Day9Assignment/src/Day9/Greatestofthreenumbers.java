package Day9;

import java.util.ArrayList;
import java.util.List;

public class Greatestofthreenumbers {

	public static void main(String[] args) {
		 // array declared
	    int numbers[] = {10, 55,9000}; 
	     
	    // Method to find maximum in numbers[] 
	     int i; 
	         
	        // Initialize maximum element 
	        int max = numbers[0]; 
	         
	        // Traverse array elements from second and 
	        // compare every element with current max 
	        for (i = 1; i < numbers.length; i++) 
	            if (numbers[i] > max) 
	                max = numbers[i]; 
	         
	        System.out.println("Largest in given array is " + max); 
	    } 
	     
	   
	
	
}