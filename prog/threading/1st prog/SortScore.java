package com.ltts.threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortScore extends Thread {
	String matchType;
	String scorestring;
	
	public SortScore(String matchType,String scoreString) {
		super();
		this.matchType = matchType;
		this.scorestring = scoreString;
	}
	
	

	
	List<Integer> l=new ArrayList<Integer>();
	
	public void run()
	{
		{
			String[] s=scorestring.split(",");
			for (int i=0;i<s.length;i++)
			{
				Integer in=Integer.parseInt(s[i]);
				l.add(in);
				}
			Collections.sort(l);
		}
	}
	public void getScores()
	{
		System.out.println("Match : "+matchType);
		for(int i:l )
		{
			System.out.println(i);
		}
	}
	

}

