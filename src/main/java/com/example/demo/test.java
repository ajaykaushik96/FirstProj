package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class test {
	
	@Autowired
private Laptop laptop;
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
public void showcomp()
{
	System.out.println(laptop + "hello");
	
}
}
