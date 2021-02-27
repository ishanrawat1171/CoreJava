package com.ltts.java2;
import java.util.*;
public class SplitClass {

	public static void main(String[] args) {
Scanner in =new Scanner(System.in);
System.out.println("Enter details");
SplitClassC obj =new SplitClassC();
obj.setAllData(in.next());
String str;
str=obj.getAllData();
String []arrStr=str.split(",",0);
System.out.println("Name:"+arrStr[0]);
System.out.println("Address:"+arrStr[1]);
System.out.println("Mobile:"+arrStr[2]);

	}

}
