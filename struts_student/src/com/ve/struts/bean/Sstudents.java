package com.ve.struts.bean;

public class Sstudents {
	
	private int id;
	private String name;
	private String email;
	private String country;
	
	
	//generate getters and setters
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	//param less constructor
	public Sstudents(){}
	//parameres contain constructor
	public Sstudents(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}
	
	// to string method
	@Override
	public String toString() {
		return "Sstudents [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + "]";
	}
	
	

	
	
	
	

}
