package comm.example;

import java.util.Date;

public class EmployeeBO extends Employee{

	public EmployeeBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBO(int id, String name, String department, int age, int salary, Date dateOfJoining) {
		super(id, name, department, age, salary, dateOfJoining);
		// TODO Auto-generated constructor stub
	}
	
	public static void printEmployees() {
		
		Employee emp = new Employee();
		System.out.println("ID: "+emp.id+"\nName: "+emp.name+"\nDepartment: "+emp.department+"\nAge :"+emp.age+"\nSalary: "+emp.salary+"\n Date of joining:"+emp.dateOfJoining);
	}
	
	
	
	

}
