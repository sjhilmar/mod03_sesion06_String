package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Employee;

public interface SecurityService {
	
	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;
	Employee findEmployeeByLogin(String login) throws DAOException, EmptyResultException;
	

}
