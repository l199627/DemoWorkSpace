package com.csii.test;

public class TuZi {
public static void main(StringTest[] args) {
	int n=4;
	System.out.println("第"+n+"个月兔子的总数为"+fun(n));
}
public static int fun(int n) {
	if(n==1||n==2) {
	return 1;
	}else {
		return fun(n-1)+fun(n-2);
	}
}
}
