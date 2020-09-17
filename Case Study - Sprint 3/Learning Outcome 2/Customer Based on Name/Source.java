 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source {
public static  String[] getCustomer(String c)
{	
    String[][] customer=new String[5][3];
	customer[0][0]="102";
	customer[0][1]="Krithick";
	customer[0][2]="Bangalore";
	
	customer[1][0]="105";
	customer[1][1]="Prabhu";
	customer[1][2]="Chennai";
	
	customer[2][0]="202";
	customer[2][1]="Shravan";
	customer[2][2]="Pune";
	
	customer[3][0]="205";
	customer[3][1]="Kiran";
	customer[3][2]="Mumbai";
	
	customer[4][0]="252";
	customer[4][1]="Chandrav";
	customer[4][2]="Delhi";
	 String[] d=new String[3];
	   
   for(int i=0;i<5;i++){

        if(c.equals(customer[i][1])){
          // System.out.println(Arrays.toString(customer[i]));
                         //d=Arrays.toString(customer[i]);
                         d=customer[i];
                         break;
                         
        }
    }
    return  d;
}
	
    public static void main( String[] args )
	{
	    Scanner s=new Scanner(System.in);
	    String c=s.next();
	    String[] a=new String[3];
	    a=new Source().getCustomer(c);
	    System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}

