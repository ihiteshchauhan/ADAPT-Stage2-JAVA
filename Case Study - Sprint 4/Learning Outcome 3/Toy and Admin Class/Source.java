import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source 
{
   String[][] toys=new String[5][5];
  Source()
  {
  toys[0][0]="1";
  toys[0][1]="Stickle Bricks";
  
  toys[1][0]="2";
  toys[1][1]="Robot Dog";
  
  toys[2][0]="3";
  toys[2][1]="Magic 8 Ball";
  
  toys[3][0]="4";
  toys[3][1]="Juggling Clubs";
  
  toys[4][0]="5";
  toys[4][1]="Chutes and Ladders";
  
  }
  
public  String getToy(int age)
{  
    return null;
}
  
    public static void main( String[] args )
  {
      Scanner sc = new Scanner(System.in);
      int toyId,minAge,maxAge;
        String toyName,toyType;
        float price,quantity,refundableDeposit,rentalAmount;
        toyId = sc.nextInt();
        sc.next();
        toyName = sc.nextLine();
        toyType = sc.next();
        minAge = sc.nextInt();
        maxAge = sc.nextInt();
        price = sc.nextFloat();
        quantity = sc.nextFloat();
        rentalAmount = sc.nextFloat();
        refundableDeposit = sc.nextFloat();
        Toy t = new Toy(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit);
        Admin a = new Admin();
  }
}
class Admin{
  private String email,password,name;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  Admin(String email, String password, String name) {
    this.email = email;
    this.password = password;
    this.name = name;
  }

  public Admin() {
    // TODO Auto-generated constructor stub
  }
}
class Toy{
  private int toyId,minAge,maxAge;
  private String toyName,toyType;
  
  private float price,quantity,refundableDeposit,rentalAmount;
  public int getToyId() {
    return toyId;
  }
  public void setToyId(int toyId) {
    this.toyId = toyId;
  }
  public String getToyType() {
    return toyType;
  }
  public void setToyType(String toyType) {
    this.toyType = toyType;
  }
  public int getMinAge() {
    return minAge;
  }
  public void setMinAge(int minAge) {
    this.minAge = minAge;
  }
  public int getMaxAge() {
    return maxAge;
  }
  public void setMaxAge(int maxAge) {
    this.maxAge = maxAge;
  }
  public String getToyName() {
    return toyName;
  }
  public void setToyName(String toyName) {
    this.toyName = toyName;
  }
  public float getPrice() {
    return price;
  }
  public void setPrice(float price) {
    this.price = price;
  }
  public float getQuantity() {
    return quantity;
  }
  public void setQuantity(float quantity) {
    this.quantity = quantity;
  }
  public float getRefundableDeposit() {
    return refundableDeposit;
  }
  public void setRefundableDeposit(float refundableDeposit) {
    this.refundableDeposit = refundableDeposit;
  }
  public float getRentalAmount() {
    return rentalAmount;
  }
  public void setRentalAmount(float rentalAmount) {
    this.rentalAmount = rentalAmount;
  }
  public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, float price, float quantity,
      float rentalAmount, float refundableDeposit){
    this.toyId = toyId;
    this.minAge = minAge;
    this.maxAge = maxAge;
    this.toyName = toyName;
    this.price = price;
    this.toyType = toyType;
    this.quantity = quantity;
    this.refundableDeposit = refundableDeposit;
    this.rentalAmount = rentalAmount;
    System.out.println("ID:" + this.toyId);
    System.out.println("ToyName:" + this.toyName);
    System.out.println("ToyType:" + this.toyType);
    System.out.println("MinAge:" + this.minAge);
    System.out.println("MaxAge:" + this.maxAge);
    System.out.println("Price:" + this.price);
    System.out.println("RefundableAmount:" + this.rentalAmount);
    System.out.println("Refundable Deposit:" + this.refundableDeposit);
  }
  public Toy() {
// TODO Auto-generated constructor stub
  }
}
