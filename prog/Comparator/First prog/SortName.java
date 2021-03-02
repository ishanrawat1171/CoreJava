package com.ltts.comparator;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SortName implements Comparator<Player> {
	public int compare(Player a, Player b)
    {	if(a.skills==b.skills)
        return a.name.compareTo(b.name);
    else
    	return a.skills.compareTo(b.skills);
    }
}