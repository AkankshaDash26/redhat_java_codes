package comm.example;

import java.util.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	int id;
	String name;
	String department;
	int age;
	int salary;
	Date dateOfJoining = new Date();
	public Employee() {
		super();
	}
	public Employee(int id, String name, String department, int age, int salary, Date dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
    
}
