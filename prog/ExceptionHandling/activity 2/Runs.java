import java.util.Scanner;
public class Runs{
    Scanner scan=new Scanner(System.in);
    int runs, balls;
    float runRate;
    public void input(){
        try{
            System.out.println("Enter the number of overs: ");
            runs=scan.nextInt();
            System.out.println("Enter the number of runs  for each overs ");
            int arr[]= new int [runs];
            for (int i=0;i<runs;i++) {
            	arr[i]=scan.nextInt();
            	          	
            }
           System.out.println("enter the over number");
           int a=scan.nextInt();
           System.out.println("runs scored in this over : "+ arr[a-1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Runs obj=new Runs();
        obj.input();
        
    }
}