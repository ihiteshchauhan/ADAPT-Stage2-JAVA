import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
	// Start Code
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[3];
	boolean flag = true;
	for(int i=0;i<3;i++)
	{
	    arr[i] = sc.nextInt();
	    if(arr[i]<0 || arr[i]>100)
	    {
	        flag = false;
	    }
	}
	if(flag)
	{
	    int sum=0,average=0;
	    for(int i=0;i<3;i++)
	    {
	        sum+=arr[i];
	    }
	    average = sum/3;
	    if(average>=70)
	    {
	        System.out.println("DISTINCTION");
	    }
	    else if(average>=60)
	    {
	        System.out.println("FIRST");
	    }
	    else if(average>=50)
	    {
	        System.out.println("SECOND");
	    }
	    else if(average>=40)
	    {
	        System.out.println("THIRD");
	    }
	    else{
	        System.out.println("FAIL");
	    }
	}
	else{
	    System.out.println("INVALIDMARKS");
	}
	// End Code

    }
}

