package com.springcore.lifecycle;

public class life {
	
	


	private double price;
	
	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}


	public life() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "life [price=" + price + "]";
	}

      public void init()
      {
    	  System.out.println("inside the init method");
      }
	
      public void destroy()
      {
    	  System.out.println("inside the destroy method");
      }
      
      
	
	

}
