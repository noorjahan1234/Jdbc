package com.Student;

public class Student {
	int rollNo;
	String name;
	int mark;

	
	  public Student(int rollNo, String name, int marks) 
	  { 
		  this.rollNo=rollNo;
	  this.name=name; 
	  this.mark=marks; }
	 
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}
