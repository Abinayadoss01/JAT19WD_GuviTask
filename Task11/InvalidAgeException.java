package Task11;

import java.util.Scanner;

public class InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age:");
		
		
		try{
			int Age = sc.nextInt();
			if(Age>80) {
			
			System.out.println("Entered Age is "+Age);
			throw new Exception();
			}
		}
		catch(Exception exp) {
			System.out.println("Entered age is invalid!!!");			
			}
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }	
		}
	
		
	}

