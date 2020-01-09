package com.app.model;

public class Employee {

	private int eid;
	private String eName;
	private double esal;
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
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", esal=" + esal + "]";
	}
	public Employee(int eid, String eName, double esal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.esal = esal;
	}

}
