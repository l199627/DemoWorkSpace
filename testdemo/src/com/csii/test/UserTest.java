package com.csii.test;

import java.util.Scanner;

public class UserTest {
public static void main(String[] args) {
	User user=new User("admin","123456");
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入原密码");
	String ypwd=sc.next();
	if(ypwd.equals(user.getPassword())) {
		System.out.println("请输入新密码");
		user.setPassword(sc.next());
	}else {
		System.out.println("输入的密码错误，无法进行修改");
	}
	System.out.println("-------用户信息--------\n"+user);
	
}
}
