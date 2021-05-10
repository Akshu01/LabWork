package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		int id;
		String name;
		double salary;
		String desi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		id = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextDouble();
		System.out.println("Enter Designation(Associate,Clerk,Programmer,Manager) : ");
		desi = sc.next();

		sc.close();

		Employee emp;
		EmployeeService ser = new EmployeeServiceImpl();
		String scheme = null;

		emp = ser.getEmployee(id, name, salary, desi, scheme);
		ser.findinsuranceScheme(emp);
		System.out.println();

		System.out.println("Employee Details is : ");
		System.out.println();

		ser.displayEmpDetails(emp);

	}

}
