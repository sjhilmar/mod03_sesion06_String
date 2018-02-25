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
public class EmployeeServiceImpl implements EmployeeService {


	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException {
			Employee emp = employeeDAO.findEmployeeByLogin(login);
		
		return emp;
	}

	

}
