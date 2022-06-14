package com.acharya.Test;

class Constructor {

	int id;
	String name;
	float salary;
	Constructor(){
		System.out.println("user define no argument "+" constructor executed");
		
	}

	void display() {
		System.out.println(id+" "+name + " "+ salary);
	}
}

public class Constructor2 {
	    public static void main(String[] srgs) {
	   	 Constructor e1=new Constructor();
	   	 Constructor e2=new Constructor();
	   	 e1.display();
	   	 e2.display();
	    }
}
