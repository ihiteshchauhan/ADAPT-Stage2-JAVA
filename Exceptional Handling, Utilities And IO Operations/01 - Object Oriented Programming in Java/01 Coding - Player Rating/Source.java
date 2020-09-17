//Create all the required classes here
import java.util.*;
abstract class Player{
 private String firstName, lastName;
 Player(String firstName, String lastName){
 this.firstName = firstName;
 this.lastName = lastName;
 }
 public String getName(){
 return firstName+" "+lastName;
 }
 abstract int getRating();
}
class CricketPlayer extends Player{
 private double averageRuns;
 CricketPlayer(String firstName, String lastName, double averageRuns){
 super(firstName, lastName);
 this.averageRuns = averageRuns;
 }
 public int getRating()
 {
 if(averageRuns>55)
 return 7;
 else if(averageRuns>50)
 return 6;
 else if(averageRuns>40)
 return 5;
 else if(averageRuns>30)
 return 3;
 else if(averageRuns>20)
 return 2;
 else
 return 1;
 }
}
class FootballPlayer extends Player{
 private int goals;
 FootballPlayer(String firstName, String lastName, int goals)
 {
 super(firstName, lastName);
 this.goals = goals;

 }
 public int getRating()
 {
 if(goals>20)
 return 5;
 else if(goals>15)
 return 4;
 else if(goals>10)
 return 3;
 else if(goals>5)
 return 2;
 else
 return 1;
 }
}
public class Source{
 public static void main(String[] args){
 //CODE HERE
 CricketPlayer cp = new CricketPlayer("Hitesh", "Chauhan", 76);
 FootballPlayer fp = new FootballPlayer("Hitesh", "Chauhan", 11);
 System.out.println(cp.getName()+" "+cp.getRating());
 System.out.println(fp.getName()+" "+fp.getRating());
 }
}
