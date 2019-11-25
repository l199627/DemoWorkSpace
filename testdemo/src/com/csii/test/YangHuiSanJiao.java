package com.csii.test;
/**
 * Ñî»ÔÈı½Ç
 * @author LML
 *Date 2019/11/7
 */
public class YangHuiSanJiao {
public static void main(StringTest[] args) {
	c(7);
}
public static int num(int x,int y) {
	if(y==1||y==x) {
		return 1;
	}
	int c=num(x-1,y-1)+num(x-1,y);
	return c;
}
public static void c(int row) {
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=row-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print(num(i,j)+" ");
		}
		System.out.println();
	}
}
}
