package com.invenmang.inventorymanagement.employee.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.invenmang.inventorymanagement.dao.repository.EmployeeRepository;
import com.invenmang.inventorymanagement.entity.Employee;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
@TestPropertySource(properties = "spring.mongodb.embedded.version=3.5.5")
class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;
	
	@MockBean
	EmployeeRepository dao;
	
	//@MockBean
//	MongoTemplate mongoTemplate;

	
	  @Test 
	  public void createNewEmployeeTest() 
	  {  
		  Employee emp1 = new Employee("110088", "Amandeep", "Singh", "973463922",
				  "Amandeep.singh8@gmail.com", "wz-34 vishnu Garden", "near mandir",
				  "Vishnu Garden", "Delhi", "India");
	  dao.save(emp1); 
	  assertEquals("110088", emp1.getId());
	  
	
	   }
	 
	 

	@Test
	public void getAllDetailTest() throws Exception {
		
		
		  List<Employee> list = new ArrayList<Employee>();
		  Employee employee1 = new Employee("110089", "Amandeep", "Singh", "973463922",
		  "Amandeep.singh8@gmail.com", "wz-34 vishnu Garden", "near mandir",
		  "Vishnu Garden", "Delhi", "India");
		  
		  Employee employee2 = new Employee("110083", "Paramjeet", "Singh",
		  "978863922", "Paramjeet.singh8@gmail.com", "wz-34 vishnu Garden",
		  "near mandir", "Vishnu Garden", "Delhi", "India"); list.add(employee1);
		  list.add(employee2);
		 
		
		when(dao.findAll()).thenReturn((List<Employee>) list); 
		List<Employee> emplist = dao.findAll(); 
		assertEquals(2, emplist.size());
		}
	
		
		
		
		  @Test public void getAllDetailByIdTest() { 
			  Employee emp11 = new Employee("116575", "Brejesh", "Singh", "932423463922",
					  "brejesh.singh8@gmail.com", "wz-34 Krishna Park", "near mandir",
					  "Krishna Park", "Delhi", "India");
			 dao.save(emp11);
			  assertEquals("116575",emp11.getId());
		  
		  }
		  
		  @Test public void updateNewEmployeeTest() { 
			  Employee emp18 = new Employee("116575", "Brejesh", "Singh", "932423463922",
					  "brejesh.singh8@gmail.com", "wz-34 Krishna Park", "near mandir",
					  "Krishna Park", "Delhi", "India");
			  dao.save(emp18);
			 emp18.setLastName("Kumar");
			 dao.save(emp18);
		 assertNotEquals("Singh", emp18.getLastName());
		  
		  }
		 
		 
		 
}