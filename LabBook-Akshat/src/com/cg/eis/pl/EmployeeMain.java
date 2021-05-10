package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;


public class EmployeeMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		System.out.println("Enter the employee name");
		String name = sc.next();
		System.out.println("Enter the employee salary");
		int sal = sc.nextInt();
		System.out.println("Enter the designation");
		String designation  = sc.next();
		System.out.println("Enter the Insurance Scheme");
		String scheme = sc.next();
		
		
		EmployeeService service = new EmployeeServiceImpl();
        Employee emp = service.getEmployee(id,name,sal,designation,scheme);
        
        
        String InsuranceScheme = service.findInsuranceScheme(emp);
        System.out.println("Insurance Scheme based on Salary structure is :" +InsuranceScheme);
        
        System.out.println("Details of Employee are : ");
        service.displayEmpDetails(emp);
		
		
		sc.close();
	}

}
