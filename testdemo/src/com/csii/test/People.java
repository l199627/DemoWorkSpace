package com.csii.test;

public class People {
public String name;
public int age;
public String sex;
public String sn;
public People(String name,int age,String sex,String sn) {
	this.name=name;
	this.age=age;
	this.sex=sex;
	this.sn=sn;
}
public String toString() {
	return "����:"+name+"\n���䣺"+age+"\n�Ա�:"+sex+"\n���֤:"+sn;
}
}
