package com.angularSpring.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.angularSpring.demo.entity.Employee;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	@Query("FROM Employee WHERE id=?1")
	List<Employee> findByEmployeeId(int id);
	
	@Transactional
	@Modifying
	@Query("UPDATE Employee SET firstName=?1 ,lastName=?2 , designation=?3 ,salary=?4 WHERE id=?5")
	void updateEmployee(String firstName,String lastName,String designation,double salary,int id);

}
