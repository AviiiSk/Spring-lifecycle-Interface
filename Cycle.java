package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cycle implements InitializingBean, DisposableBean {
	
	
	
	private double price;
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cycle [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		// init
		
		System.out.println("buying Cycle : init method");
		
	}

	public void destroy() throws Exception {
		// destroy
		
		System.out.println("Cycle taking home : destroy method ");
		
		
	}

	
	

}
