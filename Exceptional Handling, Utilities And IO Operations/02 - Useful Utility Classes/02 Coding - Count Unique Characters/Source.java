import java.util.Scanner;
public class Source {
 public static int getUniqueCharacterCount(String str){
 str = str.replaceAll("\\s", "");
 str = str.toLowerCase();
 // System.out.println(str);
 int count=0;
 // System.out.println(str.length());
 for(int i=0;i<str.length();i++){
 boolean flag = false;
 for(int j=0;j<str.length();j++){
 if(str.charAt(i)==str.charAt(j) && i!=j)
 {
 flag = true;
 break;
 }
 }
 if(!flag)
 {
 // System.out.println(str.charAt(i));
 count++;
 }
 }
 if(count>0)
 {
 return count;
 }
 return -1;
 }
public static void main(String[] args) {
//write code here
Scanner sc = new Scanner(System.in);
String word = sc.nextLine();
int n = getUniqueCharacterCount(word);
if(n==-1)
{
 System.out.println("No unique character/s");
}
else{
 System.out.println(n+" unique character/s");
}
}
 //write method here
}
