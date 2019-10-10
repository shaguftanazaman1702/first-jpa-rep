package com.cg.dao;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public interface EmpDeptDao {
	
	void save(Object e);
	
	Employee fetchEmp(int id);
	
	Department fetchDept(int id);
	
}
