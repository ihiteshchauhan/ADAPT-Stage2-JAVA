
import java.util.Scanner;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
	// Student code begins
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[3];
	boolean flag = true;
	for(int i=0;i<3;i++)
	{
	    arr[i] = sc.nextInt();
	}
	for(int i=0;i<2;i++)
	{
	    if(arr[i]<arr[i+1])
	    {
	        flag = false;
	    }
	}
	if(flag)
	{
	    int a = arr[1]*arr[1];
	    int b = arr[2]*arr[2];
	    int sum = a+b;
	    double result = Math.sqrt(sum);
	    if(result == arr[0])
	    {
	        System.out.println("RIGHT ANGLE");
	    }
	    else{
	        System.out.println("NOT RIGHT ANGLE");
	    }
	}
	else{
	    System.out.println("INVALID_INPUT");
	}
	
	
	
	
	 
	
	
	
	// Student code ends;
	
	
	
    }
}
