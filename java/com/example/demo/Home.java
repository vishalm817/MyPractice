package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	private String Owner;
	private int doorNumber;
	@Autowired
	public InternetConnection ic;
	public Home() {
		System.out.println("Hello Home Constructor");
		}
	
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	
	public void connect() {
		//InternetConnection ic =new InternetConnection();
		ic.switchOn();
		//System.out.println("Connecting to Internet");
		System.out.println("Connected");
	}
	
	
	
}
