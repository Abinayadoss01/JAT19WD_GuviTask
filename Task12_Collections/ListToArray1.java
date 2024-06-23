package ListToArray;

import java.util.LinkedList;

public class ListToArray1 {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Andy");
		ls.add("Zebra");
		ls.add("goat");
		ls.add("Sheep");
		System.out.println(ls);
		// Converting List to array using toArray() method 
        String[] array1 = ls.toArray(new String[0]); 
  
        // Printing elements of array using for-each loop 
        for (String x : array1) 
            System.out.println(x + " "); 
        }

}
