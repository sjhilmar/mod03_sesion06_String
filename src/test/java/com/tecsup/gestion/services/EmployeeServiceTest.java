package com.tecsup.gestion.services;


import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
	  @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml"),
	  @ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
	})
@WebAppConfiguration
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeetyService;

	@Test
	public void testFindEmployeeByLogin() throws EmptyResultException {
		try {
			
			
			Employee emp = employeetyService.findEmployeeByLogin("jgomez");
			Assert.assertEquals("Jaime", emp.getFirstname());
			Assert.assertEquals("Gomez", emp.getLastname());
			
		} catch (Exception e) {
			fail(e.getMessage());
			
			 
		}
	}

}
