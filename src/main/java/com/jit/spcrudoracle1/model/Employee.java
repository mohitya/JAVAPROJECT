package com.jit.spcrudoracle1.model;
public class Employee{
	private Integer id;
	private String empname;
	private Integer empsal;
	private String desig;
	public Employee() {
		super();
	}
	public Employee(Integer id, String empname, Integer empsal, String desig) {
		super();
		this.id = id;
		this.empname = empname;
		this.empsal = empsal;
		this.desig = desig;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Integer empsal) {
		this.empsal = empsal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", empsal=" + empsal + ", desig=" + desig + "]";
	}
	
}