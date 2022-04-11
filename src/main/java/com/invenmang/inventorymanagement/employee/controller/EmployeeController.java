package com.invenmang.inventorymanagement.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invenmang.inventorymanagement.dao.repository.EmployeeRepository;
import com.invenmang.inventorymanagement.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeRepository repository;

	@GetMapping("/admin")
	public List<Employee> getALLDetail() {

		List<Employee> rep = repository.findAll();
		System.out.println("THE ANSEWER" + rep.get(rep.size() - 1).getFirstName());
		return rep;

		/*
		 * model.addAttribute("employeeList", repository.findAll()); return
		 * "Employee List";
		 */

		/*
		 * return Arrays.asList(new Employee("111", "Jatinder","Singh",
		 * "9871867176","jatinder.sing@brickredsys.in", "wz-32/2 sant nagar",
		 * "Tilak Nagar", "New Delhi", "Delhi", "India" ));
		 */
	}
	
	@GetMapping("/user")
	String number() {
		return "user";
	}

	@GetMapping("/admin/{id}")
	public Employee getEmployeeDetail(@PathVariable String id) {
		java.util.Optional<Employee> employee = repository.findById(id);
		if (employee.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		return employee.get();
	}

	
	  @PostMapping("/") public Employee createNewEmployee(@RequestBody
	  Employee employee) {
	  
	  System.out.println("this the result"); return repository.save(employee);
	  
	  
	  }
	 

	
	  @PutMapping("/Detail/{id}") 
	  public void updateNewEmployee(@PathVariable
	 String id, @RequestBody Employee employee) { repository.findById(id);
	  repository.save(employee);
	   }
	  
	
	
}
