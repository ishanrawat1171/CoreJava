package com.ltts.comparator;
import java.util.*;
import java.util.ArrayList;

public class Comparator1 {
	public static void main(String[] args) {
	ArrayList<Player> ar = new ArrayList<Player>();
	int n,skill;
	String name,skill1;
	Scanner inn =new Scanner(System.in);    
	n=inn.nextInt();
	for(int i=0;i<n;i++) {
		name=inn.next();
		skill=inn.nextInt();
		if(skill==1) {
			skill1="All rounder";
			
		}
		else if(skill==2) {
			skill1="Batsman";
		}
		else {
			skill1="bowler";
			
		}
		ar.add(new Player(name,skill1));
			
		}
	Collections.sort(ar,new SortName());
	for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));
	
	}
}
