package com.angularSpring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angularSpring.demo.entity.Employee;
import com.angularSpring.demo.repository.EmployeeRepository;
import com.angularSpring.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService emplService;
	
	@PostMapping("/employees")
	void addEmployee (@RequestBody Employee employee) {
		
		emplService.saveEmployeeInfo(employee);
	} 
	
	
	@GetMapping("/all-employee")
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) emplService.getAllEmployeeInfo();
	}
	
	@DeleteMapping("/delete-employee/{id}")
	 void deleteEmployee(@PathVariable("id")int id,Employee employee) {
		
		//employee.setId(id);
		emplService.deleteEmployeeInfo(employee);
	}

	@GetMapping("/getEmployee/{id}")
	public List<Employee> getEmployeeById(@PathVariable("id")int id,Employee employee){
		
		return emplService.getEmployeeInfoById(id);
	}
	
	@PostMapping("updateEmployee/{id}")
	public void updateEmployee (@RequestBody Employee employee,@PathVariable("id")int id) {
		
		emplService.updateEmployeeInfo(employee,id);
	}
}
