package com.example.hrtest;
import com.example.hr.Employee;

public class EmployeeTest extends Employee{

	public EmployeeTest() {
		int id = 1233;
		System.out.println("Employee ID is "+id);
	}

	public static void main(String[] args) {
		Employee emp1 = new EmployeeTest();
		String c = "Abinaya";
		int d=12000;
		emp1.printName(c);
		emp1.printSalary(d);
	}

}
