
import java.util.Scanner;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static boolean checkPrime(int num){
        int count=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
	
	// Student Code begins
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	if(n1<3 || n2>1000 || n1>n2)
	{
	    System.out.println("INVALID_INPUT");
	}
	else{
	    boolean flag=false;
	    int sum=0;
	    for(int i=n1;i<=n2;i++)
	    {
	        flag = checkPrime(i);
	        if(flag)
	        {
	            sum+=i;
	        }
	    }
	    System.out.println(sum);
	}
		// Student Code ends
	
	
	
    }
}
