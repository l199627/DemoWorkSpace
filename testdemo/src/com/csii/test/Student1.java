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
		return "����:"+name+"\n���䣺"+age+"\n�Ա�:"+sex+"\n���֤:"+sn+"\nѧ�ţ�"+stuNo+"\n��ѧרҵ��"+department;
	}

}
