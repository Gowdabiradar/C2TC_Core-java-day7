package com.acharya.Test;

class Employee4 {
	 Employee4(){
		 this(4,6);	 
		 System.out.println("In employee no-arg");
	 }
	 Employee4(int x){
		 this();
		 System.out.println(x);
	 }
	 Employee4(int y,int z){
		 System.out.println(y+ " "+z);
	 }
	 
}

public class ConstructorCall {

	public static void main(String[] args) {
		
         Employee4 e= new Employee4(5);
	}

}
