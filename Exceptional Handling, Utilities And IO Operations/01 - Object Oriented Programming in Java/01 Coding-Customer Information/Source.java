// Empty Editor
import java.util.*;
class SimpleDate{
private int day, month, year;
SimpleDate()
{
}
SimpleDate(int day, int month, int year)
{
this.day= day;
this.month = month;
this.year = year;
}
public int getDay()
{
return day;
}
public int getMonth()
{
return month;
}
public int getYear()
{
return year;
}
public void setDate(int day, int month, int year){
this.day = day;
this.month = month;
this.year = year;
}
@Override
public String toString(){
return day+"/"+month+"/"+year;
}
public static boolean validateDate(SimpleDate d){
if(d.getYear()>2000 && d.getMonth()>=1 && d.getMonth()<=12)
{
if(d.getMonth()==2 )
{
if(d.getDay()>=1 && d.getDay()<=28)
{
return true;
}
return false;
}
else if(d.getMonth()==1 || d.getMonth()==3 || d.getMonth()==5 || d.getMonth()==7 || d.getMonth()==8 ||
d.getMonth()==10 || d.getMonth()==12)
{
if(d.getDay()>=1 && d.getDay()<=31)
{
return true;
}
return false;
}
else{
if(d.getDay()>=1 && d.getDay()<=30)
{
return true;
}
return false;
}
}
return false;
}
}
class Address{
private String area, city;
Address()
{
}
Address(String area, String city){
this.area=area;
this.city=city;
}
public String getArea()
{
return area;
}
public String getCity()
{
return city;
}
public void setArea(String area)
{
this.area=area;
}
public void setCity(String city)
{
this.city=city;
}
public void setAddress(String area,String city){
this.area=area;
this.city=city;
}
@Override
public String toString(){
return area+", "+city;
}
}
class Customer{
private int custId;
private String name;
public Address address;
public SimpleDate registrationDate;
Customer(){
}
Customer(int custId, String name, Address address, SimpleDate registrationDate){
this.custId = custId;
this.name = name;
this.address = address;
// if(registrationDate.validateDate(registrationDate))
// this.registrationDate = registrationDate;
// else
// this.registrationDate = null;
this.registrationDate = registrationDate;
}
public Address getAddress(){
return address;
}
public SimpleDate getRegistrationDate(){
return registrationDate;
}
@Override
public String toString(){
if(registrationDate==null)
{
if(address.getArea()==null)
{
if(address.getCity()==null)
{
return "Id : "+custId+", Name : "+name+"\nAddress : "+"UNKNOWN"+", " +"UNKNOWN"+"\nRegistered on :
"+"UNKNOWN";
}
return "Id : "+custId+", Name : "+name+"\nAddress : "+"UNKNOWN"+", " +address.getCity()+"\nRegistered on
: "+"UNKNOWN";
}
return "Id : "+custId+", Name : "+name+"\nAddress : " +getAddress()+"\nRegistered on : UNKNOWN";
}
return "Id : "+custId+", Name : "+name+"\nAddress : " +getAddress()+"\nRegistered on :
"+getRegistrationDate();
}
}
class Source{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int custId = sc.nextInt();
String name = sc.next();
sc.nextLine();
String area = sc.next();
String city = sc.next();
sc.nextLine();
int day = sc.nextInt();
int month = sc.nextInt();
int year = sc.nextInt();
SimpleDate sd = new SimpleDate(day,month,year);
Address a = new Address();
if(!area.isEmpty())
{
a.setArea(area);
}
else{
a.setArea(null);
}
if(!city.isEmpty())
{
a.setCity(city);
}
else{
a.setCity(null);
}
sd.setDate(day,month,year);
Customer c;
if(SimpleDate.validateDate(sd))
{
c = new Customer(custId, name, a, sd);
}else
c = new Customer(custId, name, a, null);
System.out.println(c);
}
}
