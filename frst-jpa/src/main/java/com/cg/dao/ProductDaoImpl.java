package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.entity.Product;

public class ProductDaoImpl implements ProductDao {
	private EntityManagerFactory factory;
	
	public ProductDaoImpl() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public int save(Product p) {
		EntityManager mgr = null;
		
		try {		
		mgr = factory.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		mgr.persist(p);
		txn.commit();
		return p.getCode();
		}finally {
			mgr.close();
		}
		
	}

	public Product fetch(int code) {
		EntityManager mgr = null;
		try {
		mgr = factory.createEntityManager();
		return (Product) mgr.find(Product.class, code);
		
		}finally {
			mgr.close();
			
	}
	}

	public boolean delete(int code) {
		EntityManager mgr = null;
		try {
		mgr = factory.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		Product p = mgr.find(Product.class, code);
		mgr.remove(p); 
		txn.commit();
		return true;
		
		}finally {
			mgr.close();
		
	}
	
	}
	
	public List<Product> fetchAll(){
		EntityManager mgr = null;
		try {
		mgr = factory.createEntityManager();
		Query query = mgr.createQuery("from Product");
		return query.getResultList();
		}finally {
		mgr.close();
		}
	}
	
}

