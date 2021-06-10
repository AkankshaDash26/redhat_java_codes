package comm.example.app;

import comm.example.Employee;
import comm.example.Engineer;
import comm.example.Manager;
import comm.example.Secretary;
import static java.lang.System.out;

import static comm.example.Employee.max;
import static java.lang.Math.PI;
import static comm.example.EmployeeType.HOURLY_PAID;
import static comm.example.EmployeeType.SALARIED;
public class App {
	
	private Employee[] employees;
	
	{
		employees=new Employee[5];
	}
	public static void main(String args[])
	{
		int a=max;
		System.out.println(a);
		System.out.println(PI);
		App app=new App();
		app.employees[0]=new Employee(11, "John", "Lennon", "johnlennon9@gmail.com",SALARIED);
		app.employees[1]=new Manager(22, "Paul", "McCartney", "paulmccartney18@hotmail.com", SALARIED,"Marketing");
		app.employees[2]=new Engineer(33, "George", "Harrison", "georgeharrison25@outlook.com", SALARIED, "Electronics");
		app.employees[3]=new Secretary(44, "Irene", "Joo-hyun", "irene29@aol.com", HOURLY_PAID, "Junior_Secretary");
		app.employees[4]=new Engineer(55, "Ringo", "Starr", "ringostarr7@yahoo.com", SALARIED, "Mechanical");		
		//enhanced for loop
		for(Employee employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			out.println(app.employees[i]);
		}
		
	}

}