package GreatestOf4numbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the Interger:");
		int n=obj1.nextInt();
		
		if(isPrime(n)) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}

	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
