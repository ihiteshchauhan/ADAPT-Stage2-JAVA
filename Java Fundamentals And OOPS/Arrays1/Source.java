import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n<1 || n>20)
		{
			System.out.println("INVALID_INPUT");
		}
		else
		{
		int ages[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		  ages[i]=sc.nextInt();	
		}
		
		
		int min=ages[0];
		for(int i=0;i<n;i++)
		{
			if(ages[i]<min)
				min=ages[i];
		}
		
		System.out.println("MIN="+min);
		
		
		int max=ages[0];
		
		for(int i=0;i<n;i++)
		{
			if(ages[i]>max)
				max=ages[i];
		}
		
		System.out.println("MAX="+max);
		}
   }
}

