package com.springcore.referrenceType;

public class Employee {
	 private int id;
	 private String name;
	 private Address ads;
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
	public Address getAds() {
		return ads;
	}
	public void setAds(Address ads) {
		this.ads = ads;
	}
	public Employee(int id, String name, Address ads) {
		super();
		this.id = id;
		this.name = name;
		this.ads = ads;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ads=" + ads + "]";
	}
	public Employee() {
		super();
	}
	 
}
