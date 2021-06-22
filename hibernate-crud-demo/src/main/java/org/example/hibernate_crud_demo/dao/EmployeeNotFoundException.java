package org.example.hibernate_crud_demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 5652981051335030646L;
	private String message;
	
}