package comm.example;

public class Employee {
	private Integer EmployeeID;
	private String FirstName;
	private String LastName;
	private String email;
	private EmployeeType employeeType;
	public static int max=10;
	public Employee() {
		super();
	}
	public Employee(Integer EmployeeID, String FirstName, String LastName, String email,EmployeeType employeeType) {
		super();
		this.EmployeeID = EmployeeID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.email = email;
		this.employeeType=employeeType;
	}
	public Integer getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email="
				+ email + " Employee Type= "+employeeType.getMessage() +"]";
	}
	

}