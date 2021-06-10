package comm.example;

public class Engineer extends Employee {
	
	private String stream;

	public Engineer() {
		super();
	}

	

	public Engineer(Integer EmployeeID, String FirstName, String LastName, String email, EmployeeType employeeType,String stream) {
		super(EmployeeID, FirstName, LastName, email, employeeType);
		// TODO Auto-generated constructor stub
		this.stream=stream;
	}



	@Override
	public String toString() {
		return "Engineer [stream=" + stream + ", toString()=" + super.toString() + "]";
	}
	
	

}