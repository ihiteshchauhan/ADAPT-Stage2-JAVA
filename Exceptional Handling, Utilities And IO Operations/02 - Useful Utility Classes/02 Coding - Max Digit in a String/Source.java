import java.util.Scanner;
import java.util.regex.*;
public class Source{
 // Code here
 public static int getMaxDigit(String str){
 if(str!=null )
 {
 Pattern p = Pattern.compile("\\d+");
 Matcher m = p.matcher(str);
 int max = 0;
 String digits = "";
 while(m.find()){
 digits+=m.group();
 }
 // System.out.println(digits);
 if(digits.length()>1){
 String arr[] = digits.split("");
 for(int i=0;i<arr.length;i++)
 {
 if (max<Integer.parseInt(arr[i]))
 {
 max = Integer.parseInt(arr[i]);
 }
 }
 if(max>0)
 {
 return max;
 }
 if(digits.isEmpty()){
 return 0;
 }
 return 0;
 }
 return -1;

 }
 return -1;
 }
 public static void main(String[] args){
 //Code here
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 int n = getMaxDigit(str);
 if(n==0 || n==-1)
 {
 System.out.println("No digits in string");
 }
 else{
 System.out.println(n);
 }
 }
}
