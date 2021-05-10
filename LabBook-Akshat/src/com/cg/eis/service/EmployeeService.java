package com.cg.eis.service;

import com.cg.eis.bean.Employee;

 public interface EmployeeService 
{
	 
	 Employee getEmployee(int empId, String empName, int salary, String designation, String EmpInsuranceScheme);
    
	 String findInsuranceScheme(Employee emp);
    
	 void displayEmpDetails(Employee emp);
    
}