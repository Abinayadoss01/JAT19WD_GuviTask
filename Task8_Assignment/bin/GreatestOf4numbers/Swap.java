package GreatestOf4numbers;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1=scc.nextInt();
		int num2=scc.nextInt();
		
		int swap=num1;
		num1=num2;
		num2=swap;

		
		System.out.println("Swapping of two numbers is" );
		System.out.println(num1 +" "+ num2);
		//System.out.println(num2);
scc.close();
	}

}
