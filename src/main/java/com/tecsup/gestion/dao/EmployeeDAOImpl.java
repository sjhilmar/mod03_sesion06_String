package com.tecsup.gestion.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.EmployeeDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.mapper.EmployeeMapper;
import com.tecsup.gestion.model.Employee;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee validate(String login, String password) throws LoginException, DAOException {
		
		String query = "SELECT login, password, employee_id, first_name, last_name, salary, department_id  "
				+ " FROM EMPLOYEES WHERE login=? AND password=?";
	
		Object[] params = new Object[] { login, password };
	
		
		try {

			Employee employee = jdbcTemplate.queryForObject(query, params, new EmployeeMapper());
			//
			return employee;

		} catch (EmptyResultDataAccessException e) {
			logger.info("Employee y/o clave incorrecto");
			throw new LoginException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}

	}

	@Override
	public Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException {
		
		String query = "SELECT employee_id, login, password,first_name, last_name, salary,department_id  from EMPLOYEES where Login = ?  ";
		
		Object [] params = new Object[] {login};
		
		try {
			Employee employee = jdbcTemplate.queryForObject(query, params, new EmployeeMapper());
			 return employee;
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+ e.getMessage());
			throw new DAOException(e.getMessage());
		}
	
	}

	}
