package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public class EmpDeptDaoImpl implements EmpDeptDao {
	private EntityManagerFactory factory;
	
	public EmpDeptDaoImpl() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	public void save(Object e) {
		EntityManager mgr= null;
		try {
			mgr =  factory.createEntityManager();
			EntityTransaction txn = mgr.getTransaction();
			txn.begin();
			mgr.persist(e);
			txn.commit();
		}finally {
			mgr.close();
		}
		
		
	}

	public Employee fetchEmp(int id) {
		EntityManager mgr =null;
		try {
			mgr = factory.createEntityManager();
			return mgr.find(Employee.class, id);
			
		}finally {
			mgr.close();
		}
	}

	public Department fetchDept(int id) {
		EntityManager mgr =null;
		try {
			mgr = factory.createEntityManager();
			return mgr.find(Department.class, id);
			
		}finally {
			mgr.close();
		}
		}
	
	
}
