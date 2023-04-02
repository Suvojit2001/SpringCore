package com.springcore.constructorInjection;

public class Person {
	private String name;
	private int id;
	private Cirtificate cirti;
	public Person(String name, int id,Cirtificate cirti){
		super();
		this.name = name;
		this.id = id;
		this.cirti=cirti;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cirti=" + cirti + "]";
	}
	
	
}
