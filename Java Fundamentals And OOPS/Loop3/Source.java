import java.util.Scanner;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    	// Student code starts
    
    
    
    public static void main(String[] args) {
	
	// Student code ends
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp=n;
	if(n<100 || n>999)
	{
	    System.out.println("INVALID_INPUT");
	}
	else
	{
	    int sum=0,rem;
	    temp=n;
	    while(temp!=0)
	    {
	        rem =  temp%10;
	        sum+=rem*rem*rem;
	        temp = temp/10;
	    }
	    if(sum==n)
	    {
	        System.out.println("ARMSTRONG");
	    }
	    else{
	        System.out.println("NOT ARMSTRONG");
	    }
	}

    }
}
