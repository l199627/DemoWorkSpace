package com.csii.test;

import java.util.Scanner;

public class SwitchCase {
public static void main(StringTest[] args) {
	System.out.println("请输入座位号码：");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	switch(num) {
	case 8:
		System.out.println("恭喜你，获得一等奖!");
		break;
	case 88:
		System.out.println("恭喜你，获得二等奖!");
		break;
	case 888:
		System.out.println("恭喜你，获得三等奖!");
		break;
	default:
		System.out.println("谢谢参与!");
		break;
	}
}
}
