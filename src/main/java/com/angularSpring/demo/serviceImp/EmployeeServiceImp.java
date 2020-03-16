package com.angularSpring.demo.serviceImp;

import java.util.List;

import com.angularSpring.demo.entity.Employee;

public interface EmployeeServiceImp {
	
	void saveEmployeeInfo (Employee employee);
	void deleteEmployeeInfo(Employee employee);
	void updateEmployeeInfo(Employee employee,int id);
	List<Employee> getAllEmployeeInfo();
	List<Employee> getEmployeeInfoById(int id);
	
}
