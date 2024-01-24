package com.capg.SpringCore1;

public class Student {

	private int stid;
	private String stname;
	
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student()
	{
		
	}
	
	//business logic method
	
	public void displayStudentInfo()
	{
		System.out.println(stid + " " + stname);
	}
	
}
