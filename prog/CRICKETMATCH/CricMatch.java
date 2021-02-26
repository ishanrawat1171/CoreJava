package com.ltts.java;
import java.util.*;
public class CricMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		CricMatchClass cm= new CricMatchClass();
		System.out.println("Enter team name");
		cm.setTeamName(sc.next());
		System.out.println("enter session");
		cm.setSession(sc.next());
		System.out.println("enter runs");
		cm.setRuns(sc.nextInt());
		System.out.println("Name:"+cm.getTeamName());
		System.out.println("Scored:"+cm.getRuns());
		if(cm.getSession().equalsIgnoreCase("first")) {
			System.out.println(cm.getRuns()+1 +" to win");
			
		}
		else {
			System.out.println("Match ended");
		}
	}

}
