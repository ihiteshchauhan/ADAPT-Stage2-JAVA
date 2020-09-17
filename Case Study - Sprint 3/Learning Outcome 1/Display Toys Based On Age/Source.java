import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Source
{
String[][] toys=new String[5][5];
Source()
{
toys[0][0]="1";
toys[0][1]="Stickle Bricks";
toys[1][0]="2";
toys[1][1]="Robot Dog";
toys[2][0]="3";
toys[2][1]="Magic 8 Ball";
toys[3][0]="4";
toys[3][1]="Juggling Clubs";
toys[4][0]="5";
toys[4][1]="Chutes and Ladders";
}
public String getToy(int age)
{
 switch(age)
 {
 case 1:
 return toys[0][1];
 case 2:
 return toys[1][1];
 case 3:
 return toys[2][1];
 case 4:
 return toys[3][1];
 case 5:
 return toys[4][1];
 }
 return "no toys available";
}
 public static void main( String[] args )
{
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 String result = new Source().getToy(n);
 System.out.println(result);
}
}
