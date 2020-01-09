package com.app.model;

public class Employee {

	private int eid;
	private String eName;
	private double eSal;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
		return "Employee [eid=" + eid + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	public Employee(int eid, String eName, double eSal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSal = eSal;
	}

}
