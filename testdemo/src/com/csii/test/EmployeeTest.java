package com.csii.test;

public class EmployeeTest {
public static void main(String[] args) {
	Employee people=new Employee();
	people.setName("李茂林");
	people.setAge(12);
	people.setPhone("13312323213");
	people.setAddress("湖南省张家界市");
	System.out.println(people.getName());
	System.out.println(people.getAge());
	System.out.println(people.getPhone());
	System.out.println(people.getAddress());
	
}
}
