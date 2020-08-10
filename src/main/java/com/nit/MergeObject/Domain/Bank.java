package com.nit.MergeObject.Domain;

public class Bank {
	private Long id;
	private String name;
	private float balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
