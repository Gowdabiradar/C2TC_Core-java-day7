package com.acharya.Test;

public class Employee2 {

	
	int id;
	String name;
	float salary;
	void display() {
		  System.out.println(id +" "+ name +" " +salary);
	}
	public Employee2( int id,  String name,  float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		  Employee2 e1=new Employee2(222,"BHAGYA",5000);
		  Employee2 e2=new Employee2(333,"BALU",5000);
		  e1.display();
		  e2.display();

}

}
