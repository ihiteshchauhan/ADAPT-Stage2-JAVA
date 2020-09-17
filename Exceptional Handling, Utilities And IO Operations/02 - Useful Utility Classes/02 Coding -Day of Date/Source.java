//import statements here
import java.util.*;
import java.text.*;
public class Source {
public static void main(String[] args) throws ParseException {
 //CODE HERE
 Scanner sc = new Scanner(System.in);
 String str = sc.next();
 String day = getDayOfDate(str);
 System.out.println(day);
}
public static String getDayOfDate(String date) throws ParseException {
//CODE HERE
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
 SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
 String stringDate = sdf.format(date1);
 return stringDate;
}
}
