package com.ltts.arithmetic;
import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("enter code for operator");
		operator=sc.nextInt();
		if(operator==1) {
			System.out.println(num1+num2);
		}
		else if(operator==2) {
			System.out.println(num1-num2);
		}
		else if(operator==3) {
			System.out.println(num1*num2);
		}
		else if(operator==4) {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Wrong input");
		}
	}

}
