package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	private int eid;
	private String ename;
	private String etech;
	@Autowired
	private Laptop laptop;
	
	@Autowired
	private test t1;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Employee() {
		super();
		System.out.println(" Contructor Message");
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtech() {
		return etech;
	}
	public void setEtech(String etech) {
		this.etech = etech;
	}
	
	public void show()
	{
		System.out.println(" Show Output");
		laptop.compile();
		System.out.println(laptop);
		t1.showcomp();
	}

}
