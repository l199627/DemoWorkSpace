package com.csii.test;

public class ChengJi {
public static void main(StringTest[] args) {
	int n=55;
	grade(n);
}
public static void grade(int n) {
	if(n>100||n<0) {
		System.out.println("输入无效");
	}else {
		String str=(n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
		System.out.println(n+str);
	}
}
}
