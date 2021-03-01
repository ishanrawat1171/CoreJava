import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Match{
	int runs;
	int overs;
	float runrate;
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public void setRunrate(int runs,int overs) {
		runrate=(float)runs/overs;
	}
	public void display() {
		System.out.println(runrate);
	}
	
}
public class BufferRead  {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		int runs=0,overs=0;
		double runrate=0;
		Match mt=new Match();
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter runs");
		try {
		runs=Integer.parseInt(reader.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		System.out.println("Enter over");
		try {
		overs=Integer.parseInt(reader.readLine());
		}
		catch(Exception e){
			System.out.println(e);
			System.exit(0);
		}
		try {
		runrate=runs/overs;
		
		}
		catch(Exception e){
			System.out.println("Divide by zero exception");
		System.exit(0);
		}
	
		mt.setRunrate(runs,overs);
		mt.setOvers(overs);
		mt.setRuns(runs);
		System.out.println("runrate:" );
		mt.display();
	
	
	}
}
