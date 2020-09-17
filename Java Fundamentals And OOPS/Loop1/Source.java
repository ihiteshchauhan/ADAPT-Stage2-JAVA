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
	
		// Student Code Begin
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1 || n>999)
		{
		    System.out.println("INVALID_INPUT");
		}
		else{
		  //  one line code to solve this problem
		  //  System.out.println(Integer.toBinaryString(n));
		  
		  // According to problem Description
            int  bin[]=new int[100];
            int i = 0;
            while(n > 0)
            {
                bin[i++] = n%2;
                n = n/2;
            }
            for(int j = i-1;j >= 0;j--)
            {
                System.out.print(bin[j]);
            }
		}
		
	
		// Student Code end
		
		
		
    }
}
