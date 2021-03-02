package com.ltts.comparator2;

public class Team {
String TeamName;
long numberOfMatches;
public Team(String teamName, long numberOfMatches) {
	super();
	TeamName = teamName;
	this.numberOfMatches = numberOfMatches;
}
@Override
public String toString() {
	return  TeamName+ "--" + numberOfMatches;
}


}
