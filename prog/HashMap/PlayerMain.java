import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
TreeMap<Integer,Player>map = new TreeMap<Integer,Player >();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of players");
 int n =Integer.parseInt(reader.readLine());
 int count=1;
 for(int i=0;i<n;i++)
 { 
	 System.out.println("Enter the details of the player"+count);
	 System.out.println("Enter the Cap Number");
	  int capNumber = Integer.parseInt(reader.readLine());
	  System.out.println("Enter the Name");
	  String name = reader.readLine();
	  System.out.println("Enter the Team name");
	  String team = reader.readLine();
	  System.out.println("Enter the Skill");
	  String skills = reader.readLine();
	  Player p = new Player();
	  p.setName(name);
	  p.setTeam(team);
	  p.setSkills(skills);
	  
	  map.put(capNumber, p);
	  count++;
	  
 }
 
 
 System.out.println("Player Details");
 Set<Map.Entry<Integer, Player>> entries = map.entrySet();
 for(Map.Entry<Integer, Player> entry : entries){
	    System.out.println( entry.getKey() + "--" + entry.getValue() );
	}
	}

}
