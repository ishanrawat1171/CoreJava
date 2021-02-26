package com.ltts.java;
import java.util.*;
public class OopsC {

	public static void main(String[] args) {
		OopsClass op=new OopsClass();
		Scanner sc= new Scanner(System.in);
		op.setName(sc.nextLine());
		op.setAddress(sc.nextLine());
		op.setNumber(sc.nextInt());
		System.out.println(op.getName());
		System.out.println(op.getAddress());
		System.out.println(op.getNumber());
	}

}
