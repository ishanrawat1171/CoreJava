
import java.util.Scanner;
public class FindId {
	  static void myMethod(int n,int id[],int score[]) {
		  int mark;
		  Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the score you want to set standard");
			mark=sc.nextInt();
			for(int i=0;i<n/2;i++) {
				if(score[i]>mark) {
					System.out.println(id[i]);
				}
			}
	  
			sc.close();
		  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n;

Scanner sc=new Scanner(System.in);
System.out.println("enter number of elemets you want in array");
n=sc.nextInt();
int []id= new int[20];
int []score=new int[20];
Scanner sc1=new Scanner(System.in);
for(int i=0;i<n/2;i++) {
		System.out.println("enter id");
		id[i]=sc1.nextInt();
		System.out.println("enter score");
		score[i]=sc1.nextInt();
}
myMethod(n,id,score);
sc1.close();
	}
	

}
