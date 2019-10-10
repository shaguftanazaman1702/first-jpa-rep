package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
@SequenceGenerator(name="eseq", sequenceName = "emp_seq")
public class Employee {
	
	@Id
	@GeneratedValue(generator = "eseq")
	@Column(name = "emp_no")
	private int empNo;
	@Column(name="ename", length = 30)
	private String empName;
	
	private double salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptNo")
	private Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
