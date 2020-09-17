import java.util.Scanner;
public class Source {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int i, j, temp;
 int a = in.nextInt();
 if (a<1 || a>20)
{ System.out.println("INVALID_INPUT"); }
 else
 {
 int arr[] = new int[a];
 for (i=0; i<a; i++)
 { arr[i] = in.nextInt(); }
 if(a%2 == 0)
 {
 for (i=0; i<a; i++)
 {
 for(j=0; j<a-1; j++)
 {
 if(arr[j]>arr[j+1])
 {
 temp = arr[j];
 arr[j] = arr[j+1];
 arr[j+1] = temp;
 }
 }
 }
 }
 else
 {
 for(i=0; i<a; i++)
 {
 for(j=0; j<a-1; j++)
 {
 if(arr[j] < arr[j+1])
 {
 temp = arr[j];
 arr[j] = arr[j+1];
 arr[j+1] = temp;
 }
 }
 }
 }
 for (i=0; i<a; i++)
 { System.out.print(arr[i] + " "); }
 }
 }
}
