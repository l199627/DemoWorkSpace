package com.csii.test;

import java.util.Scanner;

public class RunNian {
public static void main(StringTest[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("��������ݣ�ע���������1990�꣩��");
	int year=sc.nextInt();
	System.out.println("�������·ݣ�");
	int month=sc.nextInt();
	boolean isRun;
	if((year%4==0&&year%100!=0)||(year%400==0)) {
		System.out.println(year+"������");
		isRun=true;
	}else {
		System.out.println(year+"��ƽ��");
		isRun=false;
	}
	int day=0;
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		day=31;
		break;
	case 4:
	case 6:
	case 11:
		day=30;
		break;
	default:
		if(isRun) {
			day=29;
		}else {
			day=28;
		}
		break;
	}
	System.out.println(year+"��"+month+"�¹���"+day+"��");
}
}
