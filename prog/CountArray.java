package com.ltts.countarr;
import java.util.Scanner;
public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
int n,num,count=0;
int[] arr = new int[20];
System.out.println("Enter number of elements you want in an array");
n=sc.nextInt();
if(n<0) {
	System.out.println("wrong input");
	System.exit(0);
}
System.out.println("enter the numbers");
for(int i=0;i<n;i++) {
	
	arr[i]=sc.nextInt();
	if(arr[i]<0) {
		System.out.println("INVALID INPUT");
		System.exit(0);
	}
}
System.out.println("Enter number you want to find");
num=sc.nextInt();

for(int i=0;i<n;i++) {
	if(arr[i]==num) {
		count++;
	}
}

System.out.println(count);
sc.close();

	}

}
