package com.springcore.autowire;

public class Emp {
	
	private Address add;

	public Address getAddress() {
		return add;
	}

	public void setAddress(Address address) {
		this.add = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + add + "]";
	}
	
	


}
