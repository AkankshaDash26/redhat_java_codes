package comm.example.model;

public class Manager extends Employee{
	private String departmentName;

	public Manager() {
		super();
		
	}

	public Manager(String firstName, String lastName, String email, double salary,String departmentName) {
		super(firstName, lastName, email, salary);
		this.departmentName=departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" Department Name: "+departmentName;
	}

	public double calculateTax(Employee employee)
	{
	 double tax=0;
	 if(employee instanceof Manager)
	 {
		 tax= 12.0;
		 Manager manager=(Manager)employee;
		 tax= (12.0/100)*manager.getSalary();
	 }
	 if(employee instanceof Engineer)
	 {
		 tax=11.9;
		 Engineer engineer=(Engineer)employee;

		 tax=(11.9/100)*engineer.getSalary();
	 }
	 return tax;
   }

}
