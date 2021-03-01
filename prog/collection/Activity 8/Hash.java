package com.ltts.Hash;
import java.util.*;
import java.util.Iterator;
import java.util.HashSet;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		    HashSet<String> set=new HashSet();  

		    int n,count=0;
		    n=in.nextInt();
		    String st;
		    Scanner in1 =new Scanner(System.in);
		    for(int i=0;i<n;i++) {
		    	st=in1.nextLine();
		    	set.add(st);
		    }
		         Iterator<String> inn=set.iterator();  
		           while(inn.hasNext())  
		           {  
		            count++;
		            inn.next();
		           }  
		           System.out.println(count);
		
		  
	}

}
