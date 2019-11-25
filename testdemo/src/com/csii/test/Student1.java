package com.csii.test;

public class Student1 extends People {
private String stuNo;
private String department;
	public Student1(String name, int age, String sex, String sn,String stuno,String department) {
		super(name, age, sex, sn);
		this.stuNo=stuno;
		this.department=department;
	}
	public String toString() {
		return "姓名:"+name+"\n年龄："+age+"\n性别:"+sex+"\n身份证:"+sn+"\n学号："+stuNo+"\n所学专业："+department;
	}

}
