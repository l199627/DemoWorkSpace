package com.csii.test;

import java.util.Scanner;

public class SwitchCase {
public static void main(StringTest[] args) {
	System.out.println("��������λ���룺");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	switch(num) {
	case 8:
		System.out.println("��ϲ�㣬���һ�Ƚ�!");
		break;
	case 88:
		System.out.println("��ϲ�㣬��ö��Ƚ�!");
		break;
	case 888:
		System.out.println("��ϲ�㣬������Ƚ�!");
		break;
	default:
		System.out.println("лл����!");
		break;
	}
}
}
