package GreatestOf4numbers;

import java.util.Scanner;

public class NumberofDigits {
	
	public void lengthh(int n) {
		String A=Integer.toString(n);
		System.out.println("Number of digits in the Integer '"+A + "' is "+A.length());
	}
	
	public static void main(String[] args) {


		NumberofDigits num = new NumberofDigits();
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the Interger:");
			int m = obj.nextInt();
			num.lengthh(m);
		}

	}


