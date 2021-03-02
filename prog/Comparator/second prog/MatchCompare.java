package com.ltts.comparator2;

import java.util.Comparator;



public class MatchCompare implements Comparator<Team>{
	public int compare(Team a, Team b)
    {	if(a.numberOfMatches>b.numberOfMatches) {
    	return 1;
    }
    else if(a.numberOfMatches==b.numberOfMatches) {
    	return 0;
    }
    else {
    	return -1;
    }
    }
}
