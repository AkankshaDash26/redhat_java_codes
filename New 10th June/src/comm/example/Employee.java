package comm.example;

public class Employee {
	
	private Integer EmployeeID;
	private String FirstName;
	private String LastName;
	private String email;
	
    public Employee()
    {
    	super();
    }
    public Employee(Integer EmployeeID, String FirstName, String LastName, String email)
    {
    	super();
    	this.EmployeeID=EmployeeID;
    	this.FirstName=FirstName;
    	this.LastName=LastName;
    	this.email=email;
    }
	public Integer getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID+ ", FirstName=" + FirstName + ", LastName=" + LastName + ", email="
				+ email + "]";
	}
}
