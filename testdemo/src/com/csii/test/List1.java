package com.csii.test;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {

public static void main(String[] args) {
	ArrayList list1=new ArrayList();
	ArrayList list2=new ArrayList();
	list1.add("1");
	list1.add("2");
	Iterator it=list1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next()+"¡¢");
	}
	System.out.println(list1.size());
}
}
