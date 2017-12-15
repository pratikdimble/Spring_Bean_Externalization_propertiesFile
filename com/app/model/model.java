package com.app.model;

public class model {
	
	private int pid;
	private String pname;
	private int price;
	public model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "model [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
	
}
