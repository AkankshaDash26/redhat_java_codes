package comm.example;

public class Secretary extends Employee{
	
private String Designation;
	
	public Secretary()
	{
		super();
	}
	
	public Secretary(Integer EmployeeID, String FirstName, String LastName, String email, EmployeeType employeeType, String Designation)
	{
		super(EmployeeID, FirstName, LastName, email, employeeType);
		this.Designation=Designation;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDepartmentName(String Designation) {
		this.Designation = Designation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Secretary [Designation=" + Designation + ", toString()=" + super.toString()+ "]";
	}
	

}
