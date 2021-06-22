package org.example.hibernate_crud_demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Employee {
	
	@Id
	@Column(name = "id")
	private Integer employeeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;

}