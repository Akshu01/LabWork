package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(int empId, String empName, int salary, String designation, String EmpInsuranceScheme)
	{
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		emp.setInsuranceScheme(EmpInsuranceScheme);
		return emp;
	}

	@Override
	public String findInsuranceScheme(Employee emp)
	{
		if(emp.getSalary()<5000 && emp.getDesignation().equals("Clerk"))
			return "No scheme";
		else if((emp.getSalary()>=5000 && emp.getSalary()<20000) && emp.getDesignation().equals("System Associate"))
			return "Scheme C";
		else if((emp.getSalary()>=20000 && emp.getSalary()<40000) && emp.getDesignation().equals("Programmer"))
			return "Scheme B";
		else if((emp.getSalary()>=40000) && emp.getDesignation().equals("Manager"))
			return "Scheme A";
		else
			return null;
	}

	@Override
	public void displayEmpDetails(Employee emp)
	{
		System.out.println("Employee Id is :" +emp.getEmpId());
		System.out.println("Employee Name is :" +emp.getEmpName());
		System.out.println("Employee Designation is :" +emp.getDesignation());
		System.out.println("Employee Salary is :" +emp.getSalary());
		System.out.println("Employee Insurance Scheme is :" +emp.getInsuranceScheme());
	}

}
