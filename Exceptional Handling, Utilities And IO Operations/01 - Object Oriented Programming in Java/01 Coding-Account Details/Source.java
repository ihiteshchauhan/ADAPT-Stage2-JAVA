//Editor is blank for both Java 7 and Java 8
import java.util.*;
class Account{
 int accountNo;
 double balance;
 String accountType;
 public static int counter;

 Account(double balance, String accountType)
 {
 counter++;
 this.balance=balance;
 this.accountType=accountType;
 this.accountNo=counter;
 }
 public String getInfo()
 {
 return accountNo+" "+balance+" "+accountType;
 }
 public void depositAmount(double amount){
 this.balance+=amount;
 }
 public void printAccountDetails(){
 System.out.println("[Acct No : "+accountNo+", Type : "+accountType+", Balance : "+balance+"]");
 }
 public void NewBalance(){
 System.out.println("New Balance : "+balance);
 }
}
class Source{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 int n=2;
 while(n>0)
 {
 double balance=sc.nextDouble();
 String accountType = sc.next();
 double amount = sc.nextDouble();
 Account a = new Account(balance, accountType);
 a.printAccountDetails();
 a.depositAmount(amount);
 a.NewBalance();
 n--;
 }
 }
}
