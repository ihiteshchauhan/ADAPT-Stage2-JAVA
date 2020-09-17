import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Source {
 public static void main(String[] args) {
 // STUDENT CODE BEGINS HERE
 Scanner sc = new Scanner(System.in);
 String date = sc.next();
 int n = Utility.checkDate(date);
 if(n==1){
 System.out.println("Valid");
 }
 else{
 System.out.println("Invalid");
 }
 // STUDENT CODE ENDs HERE
 }
}
class Utility {
// STUDENT CODE BEGINS HERE
public static int checkDate(String dateValue){
 int returnVal = -1;
 String[] permissFormats = new String[]{"dd/MM/yyyy","dd-MM-yyyy","dd.MM.yyyy"};
 for (int i = 0; i < permissFormats.length; i++)
 {
 try
 {
 SimpleDateFormat sdfObj = new SimpleDateFormat(permissFormats[i]);
 sdfObj.setLenient(false);
 sdfObj.parse(dateValue);
 returnVal = 1;
 break;
 }
 catch(ParseException e)
 {
 }
 }
 return returnVal;
}
 // STUDENT CODE ENDs HERE
}
