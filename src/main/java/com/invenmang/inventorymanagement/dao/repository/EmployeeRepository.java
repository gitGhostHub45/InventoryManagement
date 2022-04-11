package com.invenmang.inventorymanagement.dao.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.invenmang.inventorymanagement.entity.Employee;
@Repository

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	@Override
	java.util.Optional<Employee> findById(String id);
	/* void createNewEmployee(Employee emp); */

	
	

}
