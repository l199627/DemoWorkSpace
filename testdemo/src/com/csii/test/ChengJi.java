package com.csii.test;

public class ChengJi {
public static void main(StringTest[] args) {
	int n=55;
	grade(n);
}
public static void grade(int n) {
	if(n>100||n<0) {
		System.out.println("������Ч");
	}else {
		String str=(n>=90)?"�֣�����A��":((n>60)?"�֣�����B��":"�֣�����C��");
		System.out.println(n+str);
	}
}
}
