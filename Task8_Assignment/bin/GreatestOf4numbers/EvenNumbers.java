package GreatestOf4numbers;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:" );
		int A1 = sc.nextInt();
		int even =A1 % 2;
		
		if (even == 0) {
				
		System.out.println("The Value '" +A1 +"' is an even number");
		
						}
		else {
			System.out.println("The Value '" +A1 +"' is not an even number");
			}
		sc.close();
		}


	}

