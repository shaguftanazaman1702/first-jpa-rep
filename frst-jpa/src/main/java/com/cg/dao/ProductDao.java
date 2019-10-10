package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDao {
	
	int save(Product p);
	
	Product fetch(int code);
	
	boolean delete(int code);
	
	List<Product> fetchAll(); 
	
}
