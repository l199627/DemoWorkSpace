package com.csii.test;

public class Employee {
private String name;
private int age;
private String phone;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<18||age>40) {
		System.out.println("年龄必须在18到40之间！");
		this.age =20;
	}else {
	this.age = age;
}}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
