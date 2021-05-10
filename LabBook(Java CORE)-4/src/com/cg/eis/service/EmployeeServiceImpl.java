package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployee(int id, String name, double salary, String designation, String insurancescheme) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		emp.setInsurancescheme(insurancescheme);
		return emp;
	}

	@Override
	public void findinsuranceScheme(Employee emp) {
		if (emp.getSalary() < 5000) {
			if (emp.getDesignation().equals("Clerk")) {
				emp.setInsurancescheme("NO SCHEME");
			}
		} else if (emp.getSalary() > 5000 && emp.getSalary() < 20000) {
			if (emp.getDesignation().equals("Associate")) {
				emp.setInsurancescheme("SCHEME C");
			}
		} else if (emp.getSalary() >= 20000 && emp.getSalary() < 40000) {
			if (emp.getDesignation().equals("Programmer")) {
				emp.setInsurancescheme("SCHEME B");
			}
		} else if (emp.getSalary() >= 40000) {
			if (emp.getDesignation().equals("Manager")) {
				emp.setInsurancescheme("SCHEME A");
			}
		}

	}

	@Override
	public void displayEmpDetails(Employee emp) {
		System.out.println("Employee ID : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("Designation : " + emp.getDesignation());
		System.out.println("INSURANCE SHEME : " + emp.getInsurancescheme());

	}

}
