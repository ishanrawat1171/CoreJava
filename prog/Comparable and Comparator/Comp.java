package com.ltts.comparable;
import java.util.*;  
import java.io.*;  
class Players implements Comparable<Players>{  
int Score;  
String name;  

Players(int Score,String name){  
this.Score=Score;  
this.name=name;  
 
}  
public int compareTo(Players st){  
if(Score==st.Score)  
return 0;  
else if(Score>st.Score)  
return -1;  
else  
return 1;  
}  
}  



public class Comp {

	
		
		public static void main(String args[]){  
			ArrayList<Players> al=new ArrayList<Players>();  
			Scanner in =new Scanner(System.in);
			int number;
			int Score,count=0;
			String name;
			System.out.println("Enter number of players");
		number=in.nextInt();
	
		System.out.println("Enter the name and score respectively");
		
		for(int i=0;i<number;i++) {
			Scanner in1 =new Scanner(System.in);
			name=in1.nextLine();
			Score=in1.nextInt();
			al.add(new Players(Score,name)); 
		}
			 
			
			Collections.sort(al);  
			for(Players st:al){  
				count++;
			System.out.println(count+" "+st.Score+" "+st.name+" ");  
			
			}  
	}

}
