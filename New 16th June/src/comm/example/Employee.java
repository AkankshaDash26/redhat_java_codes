package comm.example;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method stub
	 * return 0; }
	 */

}