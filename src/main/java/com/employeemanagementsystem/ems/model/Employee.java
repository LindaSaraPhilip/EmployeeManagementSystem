package com.employeemanagementsystem.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_tbl")
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empid;
	private String fname;
	private String lname;
	private String email;
	private Long mobile;
	private int salary;
	private String designation;
	private String reportsto;
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getReportsto() {
		return reportsto;
	}
	public void setReportsto(String reportsto) {
		this.reportsto = reportsto;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile="
				+ mobile + ", salary=" + salary + ", designation=" + designation + ", reportsto=" + reportsto + "]";
	}
	public Employee(String fname, String lname, String email, Long mobile, int salary, String designation,
			String reportsto) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.designation = designation;
		this.reportsto = reportsto;
	}
	
	
	

}
