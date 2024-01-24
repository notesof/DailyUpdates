package com.capg.Di;

public class Student {
	
	int stdId;
	String stdName;
	
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
		return "[ "+stdId+" , "+stdName+" ] ";
	}

}
