import java.time.*;
import java.util.*;
class AgeCalculator{
 public int[] calculateAge(String str){
 int arr[] = new int[2];
 String []date = str.split("/");
 int day = Integer.parseInt(date[0]);
 int month = Integer.parseInt(date[1]);
 int year = Integer.parseInt(date[2]);
 if(year<=2019){
 if(year==2019 && month>=4){
 }
 else{
 if(month>4){
 arr[0] = 2019-year-1;
 arr[1] = 16-month;

 }
 else{
 arr[0] = 2019-year;
 arr[1] = 4-month;
 }
 return arr;
 }
 }
 return null;
 }
}
class Source{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 String date = sc.nextLine();
 AgeCalculator ac = new AgeCalculator();
 int arr[] = ac.calculateAge(date);
 boolean flag = true;
 if(arr!=null){
 if(arr[0]!=0)
 {
 if(arr[1]==0){
 System.out.print("Years : "+arr[0]);
 flag = false;
 }
 else{
 System.out.print("Years : "+arr[0]+", ");
 flag = true;
 }
 }
 if(flag){
 System.out.print("Months : "+arr[1]);
 }
 }
 else{
 System.out.println("Invalid date of birth");
 }
 }
}
