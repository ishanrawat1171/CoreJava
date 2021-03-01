package com.ltts.arraylist;

import java.util.*;
public class SwapPos {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<String> al=new ArrayList();
		
		String teamName;
		Scanner in =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			teamName=in.nextLine();
			al.add(teamName);
		}
		System.out.println("Enter the first number");
		int n,n1;
		n=in.nextInt();
		System.out.println("Enter the 2nd number");
		n1=in.nextInt();
		Collections.swap(al, n, n1);
		System.out.println("Table");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
