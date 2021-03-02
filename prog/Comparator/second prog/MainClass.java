package com.ltts.comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ltts.comparator.SortName;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in =new Scanner(System.in);
		ArrayList<Team> arr=new ArrayList<Team>();
		System.out.println("enter number of teams");
		n=in.nextInt();
		String teamName;
		long matches;
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter team"+(i+1)+" details");
			System.out.println("Enter team name");
			teamName=in.next();
			System.out.println("Enter the number of matches");
			matches=in.nextLong();
			arr.add(new Team(teamName,matches));
		}
		Collections.sort(arr,new MatchCompare());
		System.out.println("Team list after sort by number of matches");
		for (int i=0; i<arr.size(); i++)
	        System.out.println(arr.get(i));
		
		}
	}


