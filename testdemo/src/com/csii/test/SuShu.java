package com.csii.test;

public class SuShu {
public static void main(StringTest[] args) {
	int m=1;
	int n=10;
	int count=0;
	for(int i=m;i<=n;i++) {
		if(isPrime(i)) {
			count++;
			System.out.println(i+" ");
		}
	}
	System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
}
public static boolean isPrime(int n) {
	boolean flag=true;
	if(n==1) {
		flag=false;
	}else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}else {
				flag=true;
			}
		}
	}
	return flag;
}
}
