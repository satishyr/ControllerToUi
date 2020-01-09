package com.app.model;

public class Employee {

	private int id;
	private String eName;
	private double eSal;
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEName() {
		return eName;
	}
	public void setEName(String eName) {
		this.eName = eName;
	}
	public double getEsal() {
		return eSal;
	}
	public void setESal(double eSal) {
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	public Employee(int id, String eName, double eSal) {
		super();
		this.id = id;
		this.eName = eName;
		this.eSal = eSal;
	}

}
