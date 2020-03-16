package com.angularSpring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularSpring.demo.entity.Employee;
import com.angularSpring.demo.repository.EmployeeRepository;
import com.angularSpring.demo.serviceImp.EmployeeServiceImp;

@Service
public class EmployeeService implements EmployeeServiceImp{
	
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public void saveEmployeeInfo(Employee employee) {
		
		empRepository.save(employee);
	}

	@Override
	public void deleteEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		empRepository.delete(employee);
	}

	@Override
	public void updateEmployeeInfo(Employee employee,int id) {
		// TODO Auto-generated method stub
		empRepository.updateEmployee(employee.getFirstName(),employee.getLastName(), 
		employee.getDesignation(), employee.getSalary(), id);
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return (List<Employee>) empRepository.findAll();
	}

	@Override
	public List<Employee> getEmployeeInfoById(int id) {
		// TODO Auto-generated method stub
		return empRepository.findByEmployeeId(id);
	}
	
	

}
