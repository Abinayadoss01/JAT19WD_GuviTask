package Samplepackage;

import java.util.Scanner;

public class ForLoopPattern {

	public ForLoopPattern(String a) {
		// TODO Auto-generated constructor stub
	}

	public void Palindrome1(String a) {
		
		//String b;
		for(int i=0;i<=5;i++) {
		System.out.println("Entered string is :" +a);
		}
	}

	public static void main(String[] args) {
		 
	
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		ForLoopPattern obj=new ForLoopPattern(a);
		obj.Palindrome1(a);
	}

}
                   