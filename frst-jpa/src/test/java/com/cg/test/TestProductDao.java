package com.cg.test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.entity.Product;

public class TestProductDao {
	
	private ProductDao dao;
	EntityManager mgr = null;
	

	@Before
	public void init() {
		dao = new ProductDaoImpl();
		
	}
	
	@After
	public void destroy() {
		dao = null;
	}
	

	@Test
	public void testSave() {
		Product p = new Product();
		p.setName("RedMi");
		p.setPrice(9999.99);
		p.setStock(30);
		dao.save(p);

}
		@Test
		public void testFetch() {
			Product p = dao.fetch(1);
		System.out.println(p.toString());
			
	        }
		
		@Test
		public void testDelete() {
			assertEquals(true, dao.delete(7));
		}
}
			
		