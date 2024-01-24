package com.capg.Di;

public class Student {
	
	int stdId;
	String stdName;
	Address address;
	
	public Student(int stdId, String stdName, Address address) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;
	}

	public int getStdId() {
		return this.stdId;
	}
	
	public void setStdId(int stdId) {
		this.stdId=stdId;
	}
	
	public String getStdName(String stdName) {
		return stdName;
	}
	
	public void setStdName(String stdName) {
		this.stdName=stdName;
	}
	
	public String toString() {
		return "[ "+stdId+" , "+stdName+" , "+address+" ] ";
	}

}
