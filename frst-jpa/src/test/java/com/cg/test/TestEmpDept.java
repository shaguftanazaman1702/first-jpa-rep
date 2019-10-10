package com.cg.test;

import org.junit.Before;
import org.junit.Test;

import com.cg.dao.EmpDeptDao;
import com.cg.dao.EmpDeptDaoImpl;
import com.cg.entity.Department;
import com.cg.entity.Employee;

public class TestEmpDept {
	private EmpDeptDao dao;
	 
	@Before
	public void init() {
		dao = new EmpDeptDaoImpl();
	}
	
	/*@Test
	public void testCascade() {
		Department d = new Department();
		d.setDeptNo(20);
		d.setDeptName("Sales");
		
		Employee e1 = new Employee();
		e1.setEmpName("Mark");
		e1.setSalary(3000);
		e1.setDept(d);
		
		Employee e2 = new Employee();
		e1.setEmpName("Sean");
		e1.setSalary(3500);
		e1.setDept(d);
		
		d.getEmps().add(e1);
		d.getEmps().add(e2);
		
		dao.save(d);
	}*/
	
/*	@Test
	public void testSaveDept() {
		Department d = new Department();
		d.setDeptNo(20);
		d.setDeptName("Finance");
	dao.save(d);
	} */

/*	@Test
	public void testSaveEmp(){
		Employee e= new Employee();
		e.setEmpName("Polo");
		e.setSalary(5000);
		
		Department d =  dao.fetchDept(10);
		e.setDept(d);
		
		dao.save(e);
	}*/
	
	@Test
	public void testFetch() {
		Department d = dao.fetchDept(20);
		System.out.println(d.getDeptName());
		System.out.println(d.getEmps());
	}
}



