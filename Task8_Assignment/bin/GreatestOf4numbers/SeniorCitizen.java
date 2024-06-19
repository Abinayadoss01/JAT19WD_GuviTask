package GreatestOf4numbers;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int Age = sc.nextInt();
		
		
		if (Age>60) {
				
		System.out.println("The person Age is '" +Age +"' and He is Senior citizen");
		
	}
		else {
			System.out.println("The Person age is  '" +Age +"' He is not Senior citizen");
			}
		}

	}


