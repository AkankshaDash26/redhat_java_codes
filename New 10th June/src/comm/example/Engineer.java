package comm.example;

public class Engineer extends Employee{
	
	private String Stream;
	
	public Engineer() {
		super();
	}
	
	public Engineer(Integer EmployeeID, String FirstName, String LastName, String email, String Stream)
	{
		super(EmployeeID, FirstName, LastName, email);
		this.Stream=Stream;
	}
	
	
	
	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Engineer [Stream=\" + Stream + \", toString()=\" + super.toString() + \"]";
	}

}
