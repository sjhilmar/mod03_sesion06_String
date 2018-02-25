package com.tecsup.gestion.model;

public class Employee extends Credential {

	private int employeeId;
	private String firstname;
	private String lastname;
	private String email;
	private int salary;
	private int departamentId;

	
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String firstname, String lastname, String email, int salary, int departamentId) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salary = salary;
		this.departamentId = departamentId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartamentId() {
		return departamentId;
	}
	public void setDepartamentId(int departamentId) {
		this.departamentId = departamentId;
	}
	
	
	
	
	
	
}
