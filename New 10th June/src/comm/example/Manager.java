package comm.example;

public class Manager extends Employee{
	
	private String DepartmentName;
	
	public Manager()
	{
		super();
	}
	
	public Manager(Integer EmployeeID, String FirstName, String LastName, String email, String DepartmentName)
	{
		super(EmployeeID, FirstName, LastName, email);
		this.DepartmentName=DepartmentName;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager [DepartmentName=" + DepartmentName + ", toString()=" + super.toString()+ "]";
	}
	
	

}
