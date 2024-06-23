package com.example.hr;

import java.util.Scanner;

public class Employee {
public void printName(String a) {
	
	System.out.println("Name of the employee :"+a);
}
	
public void printSalary(int n) {
	System.out.println("Salary of the employee :"+n);
	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	Employee emp=new Employee();
	String a =sc.next();
	emp.printName(a);
	int b =sc.nextInt();
	emp.printSalary(b);
	}



}