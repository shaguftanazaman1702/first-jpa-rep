package com.cg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.cg.entity.Product;

public class TestProduct2 {
	
	
		@Test
		public void testDetached() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager mgr = factory.createEntityManager();
	
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		Product p = (Product) mgr.find(Product.class, 9);
		txn.commit();
		mgr.close();
		
		mgr = factory.createEntityManager();
		txn = mgr.getTransaction();
		txn.begin();
		p.setStock(80); // this will not update the value into the database. Hence, use merge function
		mgr.merge(p);// to update existing entity in table
		txn.commit();
		mgr.close();
	}

		@Test
		public void merge() {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
			EntityManager mgr = factory.createEntityManager();
		
			EntityTransaction txn = mgr.getTransaction();
			txn.begin();
			Product p = new Product();
			p.setCode(123);// this number is matched but s it does not exist, it takes value from autogen.
			p.setCode(1);// this number exists already, hence its data gets overwritten
			p.setName("Realme");
			p.setPrice(5000);
			p.setStock(10);
			mgr.merge(p);
			txn.commit();
			mgr.close();
			
		}
		}

