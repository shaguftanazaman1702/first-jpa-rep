package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity //to tell that this is an entity now. Mandatory
@Table(name = "prod_master")    // to tell which table to match to
@NamedQuery(name= "stockQuery", query = "from Product where stock>:st")
public class Product {
	@Id //for assigning primary entity. Mandatory
	@GeneratedValue   //if we want the value of code to be generated as autogen
	private int code;
	@Column(name = "prod_name", length=30)	//to make the limit of name variable/column
	private String name;
	private double price;
	private int stock;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
