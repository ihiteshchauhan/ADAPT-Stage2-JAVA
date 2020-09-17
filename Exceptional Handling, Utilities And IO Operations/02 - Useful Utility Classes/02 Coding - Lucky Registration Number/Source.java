import java.util.*;
import java.util.regex.*;
class Source{
 public static int checkRegistrationNumber(String num){
 if(num!=null){
 String regex = "(KA|DL)(01|02|03|04|05|06|07|08|09|10)[A-Z]{1,2}[1-9]{1}[0-9]{3}$";
 Pattern p = Pattern.compile(regex);
 Matcher ma = p.matcher(num);
 boolean flag = ma.matches();
 if(flag)
 {
 String s= num.substring(num.length()-4, num.length());
 int m = Integer.parseInt(s);
 // System.out.println(m);
 int sum=0;
 while(m>0 || sum>9){
 if(sum>9 && m==0)
 {
 m=sum;
 sum=0;
 }
 int rem = m%10;
 sum+=rem;
 m/=10;
 }
 if(sum==6)
 {
 return 1;
 }
 else{
 return 0;
 }
 }
 return -1;
 }
 else
 return -1;
 }
 public static void main(String[] args)
 {

 Scanner sc = new Scanner(System.in);
 String num = sc.next();
 int n = checkRegistrationNumber(num);
 if(n==1)
 {
 System.out.println("Lucky registration number");
 }
 else if(n==0)
 {
 System.out.println("Valid registration number");
 }
 else{
 System.out.println("Invalid registration number");
 }
 }
}
