package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("Setting price of pepsi");
	}

	public Pepsi(int price) {
		super();
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
	}

	public void destroy() throws Exception {
		
		System.out.println("Inside destroy of pepsi");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init of pepsi");
		
	}
	
}
