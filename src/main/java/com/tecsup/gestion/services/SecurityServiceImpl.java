package com.tecsup.gestion.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.tecsup.gestion.dao.EmployeeDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;



@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee validate(String login, String password) throws LoginException, DAOException {
		

		Employee emp = employeeDAO.validate(login, password);

		return emp;

		
		
//		Employee emp = null ; 
//		if(login.equals("jgomez") && password.equals("123456"))
//			emp = new Employee();
//			emp.setLogin("jgomez");
//			emp.setPassword("123456");
//
//		return emp;
	}

	@Override
	public Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException {
			Employee emp = employeeDAO.findEmployeeByLogin(login);
		
		return emp;
	}
	
	

}
