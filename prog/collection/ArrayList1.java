package com.ltts.arraylist;

import java.util.ArrayList;
import java.util.*;
public class ArrayList1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	ArrayList list =new ArrayList();
	Scanner in =new Scanner(System.in);
	String name;
	System.out.println("Enter name of the player");
	name=in.next();
	
	list.add(name);
	System.out.println("Enter country");
	String country;
	country=in.next();
	list.add(country);
	int age;
	System.out.println("Enter age");
	age=in.nextInt();
	list.add(age);
	Iterator it=list.iterator();
	System.out.println("Player details");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Scanner in1 =new Scanner(System.in);
	String skill;
	System.out.println("Enter skill");
	skill=in1.nextLine();
	int pos;
	System.out.println("Enter position you want skill to be inserted");
	pos=in1.nextInt();
	list.add(pos,skill);

	Iterator it1=list.iterator();
	System.out.println("Player details");
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	System.out.println("Enter location of element u want to be deleted");
	int n;
	n=in.nextInt();
	list.remove(n);
	System.out.println("players details");
	Iterator it2=list.iterator();
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}
	in.close();
	in1.close();
	
	}
	

}