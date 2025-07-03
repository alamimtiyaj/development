package com.entity;

import java.util.*;

public class Customers {
	
	private int id;
	private String name;
	private String email;
	private List<String> number;
	public Customers(int id, String name, String email, List<String> number) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	
	
	

}
