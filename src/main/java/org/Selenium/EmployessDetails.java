package org.Selenium;

public class EmployessDetails {
	public EmployessDetails(int empID, String empName, int empSalary, int experence) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpSalary = empSalary;
		this.experence = experence;
	}
	private int EmpID;
	private String EmpName;
	private int EmpSalary;
	private int experence;
	
	
	
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	public int getExperence() {
		return experence;
	}
	public void setExperence(int experence) {
		this.experence = experence;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return EmpID+"-"+EmpName+"-"+EmpSalary+"-"+experence;
	}

}
