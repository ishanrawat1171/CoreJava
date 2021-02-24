package world.hello;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter year");

a=sc.nextInt();
if(a%4==0 || a%100==0) {
	System.out.println("Leap year");
}
else {
	System.out.println("Not leap year");
}
sc.close();
	}
	}

