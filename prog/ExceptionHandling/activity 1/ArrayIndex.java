package com.ltts.buffer;
import java.lang.reflect.Array;
import java.util.*;
public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
 int overs=0;
 System.out.println("Enter number of overs");
 try {
 overs=in.nextInt();
 }
 catch(Exception e) {
	 System.out.println("java.lang.NegativeArraySizeException");
 }
 int []arr=new int[overs];
 int number=0;
 
 System.out.println("Enter number of runs for each overs");
 for(int i=0;i<overs;i++) {
	 arr[i]=in.nextInt();
 }
 System.out.println("enter the over number");
 number=in.nextInt();
 try {
	System.out.println(arr[number]);
 }
 catch(Exception e) {
	 System.out.println(e);
 }
 
	}

}
