package comm.example.model;

public class Secretary extends Employee{
	private String departmentName;

	public Secretary() {
		super();
		
	}

	public Secretary(String firstName, String lastName, String email, double salary,String departmentName) {
		super(firstName, lastName, email, salary);
		this.departmentName=departmentName;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" Department Name: "+departmentName;
	}
}
