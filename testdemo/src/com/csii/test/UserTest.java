package com.csii.test;

import java.util.Scanner;

public class UserTest {
public static void main(String[] args) {
	User user=new User("admin","123456");
	Scanner sc=new Scanner(System.in);
	System.out.println("������ԭ����");
	String ypwd=sc.next();
	if(ypwd.equals(user.getPassword())) {
		System.out.println("������������");
		user.setPassword(sc.next());
	}else {
		System.out.println("�������������޷������޸�");
	}
	System.out.println("-------�û���Ϣ--------\n"+user);
	
}
}
