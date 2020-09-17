import java.util.*;
import java.util.regex.*;
class Source{
 public static int validateHexCode(String code){
 String regex = "^#([A-F0-9]{6})$";
 Pattern p = Pattern.compile(regex);
 Matcher m = p.matcher(code);
 boolean flag = m.matches();
 if(flag)
 return 1;
 return -1;

 }
 public static int validateDecimalCode(String s) {
 if (s.startsWith("rgb") == false) return -1;
 s = s.substring(4, s.length() - 1);
 String str[] = s.split(",");
 if (str.length != 3) return -1;
 try {
 int x = Integer.parseInt(str[0]);
 if (x < 0 || x > 255) return -1;
 x = Integer.parseInt(str[1]);
 if (x < 0 || x > 255) return -1;
 x = Integer.parseInt(str[2]);
 if (x < 0 || x > 255) return -1;
 } catch (Exception e) {
 return -1;
 }
 return 1;
}

 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 if(n==1){
 String code = sc.next();
 int m = validateHexCode(code);
 if(m==1){
 System.out.println("Valid Code");
 }
 else{
 System.out.println("Invalid Code");
 }

 }
 else if(n==2){
 String code = sc.next();
 int m = validateDecimalCode(code);
 if(m==1){
 System.out.println("Valid Code");
 }
 else{
 System.out.println("Invalid Code");
 }

 }
 else{
 System.out.println("Invalid choice");
 }
 }
}
