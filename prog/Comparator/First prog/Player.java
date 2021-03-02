package com.ltts.comparator;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Player {
String name;
String skills;
public Player(String name, String skills) {
	super();
	this.name = name;
	this.skills = skills;
}
@Override
public String toString() {
	return "Player name=" + name + ", skills=" + skills + "]";
}

}

