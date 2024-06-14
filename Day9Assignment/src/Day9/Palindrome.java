package Day9;

import java.util.Scanner;

public class Palindrome {
	
	public void palin() 
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a string:");
		String[] b= new String[5];
		b[0]=s.next();
		s.close();
		String c=b[0];
		String d=reverseString(c);
		System.out.println("Entered string:"+c);
		System.out.println("Reversed string:"+d);
		
		if(c.equals(d))
		{
			System.out.println("Entered string is palindrome");
		}
		else 
		{
			System.out.println("Entered string is not a palindrome");
		}
			
	}

	private static String reverseString(String c) {
		// TODO Auto-generated method stub
		char[] CA = c.toCharArray();  
        int length = CA.length;  
        char[] reversedArray = new char[length];  
        for (int i = 0; i < length; i++) {  
            reversedArray[i] = CA[length - i - 1];  
           // System.out.println(reversedArray);
        }  
        return new String(reversedArray);
        
        
		
	}

}
