package com.springcore.constructorInjection;

public class Cirtificate {
	private String name;

	public Cirtificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cirtificate [name=" + name + "]";
	}

	public Cirtificate() {
		super();
	}
	
}
