import java.util.Scanner;

public class Source {
	public  String customerArray[][]=new String[5][3];
	
	public void createCustomer(String[][] array)
	{
		// your code here
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        customerArray[i][j] = array[i][j];
		    }
		}
		
	}
	
	public static void sort2D(String [] [] array, int column_index){ 
		for(int i=1; i<array.length; i++){ 
			int index = i; 
			for(int j=i-1; j>=0; j--, index--) 
				if(Integer.parseInt(array[j][column_index])>Integer.parseInt(array[index][column_index])) 
					swap2rows(array, index,j); 
				else 
					break; 
		} 
	} 
	 
	// swap 2 rows subroutine 
	 
	public static void swap2rows(String [][] array, int index, int j){ 
		String temp; 
		for(int i=0; i<array[j].length; i++){ 
			temp = array[j][i]; 
			array[j][i] = array[index][i]; 
			array[index][i] = temp; 
		} 
	}
	
	public  String[][] getCustomers()
	{
	    
         sort2D(customerArray,0);
         return customerArray;
	    
	}
	public static void main(String args[])
	{
	    Source s = new Source();
	    Scanner sc = new Scanner(System.in);
	  String customerDetails[][] = new String[5][3];
	  for(int i=0;i<5;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        customerDetails[i][j] = sc.next();
		    }
		}
		s.createCustomer(customerDetails);
		String [][] result = s.getCustomers();
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(result[i][j]+" ");
		    }
		    System.out.println();
		}
	  
	}
}
