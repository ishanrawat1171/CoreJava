package com.ltts.threading2;

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
	int min=10000;
	int max=0;
	double mean=0;
	public void run()
	{
		{
			String[] s=scorestring.split(",");
			for (int i=0;i<s.length;i++)
			{
				Integer in=Integer.parseInt(s[i]);
				l.add(in);
				if(in<min) {
					min=in;
				}
				if(in>max) {
					max=in;
				}
				mean=mean+in;
				}
			mean=mean/s.length;
			Collections.sort(l);
		}
	}
	public void getScores()
	{
		System.out.println("Match : "+matchType);
		System.out.println("min "+min);
		System.out.println("max "+max);
		System.out.println("mean "+mean);
	}
	

}

