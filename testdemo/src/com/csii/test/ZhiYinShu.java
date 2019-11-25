package com.csii.test;

public class ZhiYinShu {
public static void main(StringTest[] args) {
	int n=9;
	decompose(n);
}
public static void decompose(int n) {
	System.out.print(n+"=");
	for(int i=2;i<n+1;i++) {
		while(n%i==0&&n!=i) {
			n/=i;
			System.out.print(i+"*");
		}if(n==i) {
			System.out.println(i);
			break;
		}
	}
}
}
