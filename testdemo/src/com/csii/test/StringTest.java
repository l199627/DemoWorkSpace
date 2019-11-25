package com.csii.test;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
public class StringTest {
public static void main(String[] args) {
Integer[] n=new Integer[5];
n[0]=1;
n[1]=3;
n[2]=2;
n[3]=5;
n[4]=4;
Arrays.sort(n,Collections.reverseOrder());
for(int m:n) {
	System.out.println(m);
}

}
}
