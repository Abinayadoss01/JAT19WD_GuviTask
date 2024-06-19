package GreatestOf4numbers;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scc.nextInt();
		
		int A1=1;
		int i;
		for(i=1;i<=n;i++) {
			
		A1=A1*i;
		}	
		System.out.println("The factorial Value  is " +A1);
		scc.close();
	}

}
