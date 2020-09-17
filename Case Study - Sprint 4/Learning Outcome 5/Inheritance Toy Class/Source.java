import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

interface AdminService{
    boolean validateAdmin(String email, String password);
}

class Admin
{
	private String name;
	private String email;
	private String password;
	
// 	public static Admin adminArray[]=new Admin[];
// 	public Admin()
// 	{
		
// 	}
	public Admin(String name,String email, String password) {
// 		super();
        this.password = password;
        this.name = name;
        this.email = email;
		
	}
	public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
	
}

class AdminServiceImpl implements AdminService
{
    public static Admin[] adminArray=new Admin[5];
    
    AdminServiceImpl()
    {
        adminArray[0]=new Admin("Krithick","krithick@gmail.com","krithi");
        adminArray[1]=new Admin("Rajan","rajan@gmail.com","rajan#345");
        adminArray[2]=new Admin("Chandrav","chand@gmail.com","wel$234");
        adminArray[3]=new Admin("Ankit","ankit@gmail.com","kit@56");
        adminArray[4]=new Admin("Akilan","akilan@gmail.com","ak*76");
    }
    public boolean validateAdmin(String email,String password)
	{
	    for(Admin a:adminArray){
            if(a.getEmail().equals(email) && a.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
	}
	
}

class Toy{
  private int toyId,minAge,maxAge,price,quantity,refundableDeposit,rentalAmount;
  private String toyName,toyType;

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
  public void setPrice(int price) {
    this.price = price;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public int getRefundableDeposit() {
    return refundableDeposit;
  }
  public void setRefundableDeposit(int refundableDeposit) {
    this.refundableDeposit = refundableDeposit;
  }
  public int getRentalAmount() {
    return rentalAmount;
  }
  public void setRentalAmount(int rentalAmount) {
    this.rentalAmount = rentalAmount;
  }
  public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, int price, int quantity,
    int rentalAmount, int refundableDeposit){
        this.toyId=toyId;
    this.minAge = minAge;
    this.maxAge = maxAge;
    this.toyName = toyName;
    this.price = price;
    this.toyType = toyType;
    this.quantity = quantity;
    this.refundableDeposit = refundableDeposit;
    this.rentalAmount = rentalAmount;
  }
  public Toy() {
// TODO Auto-generated constructor stub
  }
}

class ElectronicToy extends Toy{
    private int numberOfBatteries;
    private String operatingMode;
    ElectronicToy(int toyId, String toyName, String toyType, int minAge, int maxAge, int price, int quantity,
      int rentalAmount, int refundableDeposit, int numberOfBatteries, String operatingMode){
          super(toyId, toyName, toyType, minAge, maxAge, price, quantity,rentalAmount, refundableDeposit);
      this.numberOfBatteries = numberOfBatteries;
      this.operatingMode = operatingMode;
      }
      @Override
      public String toString(){
        return "ToyName: "+getToyName()+"\nType: "+getToyType()+"\nMode: "+operatingMode+"\nBatteries: "+numberOfBatteries;   
      }
}
class MusicalToy extends Toy{
    private int noOfSpeakers;
    MusicalToy(int toyId, String toyName, String toyType, int minAge, int maxAge, int price, int quantity,
      int rentalAmount, int refundableDeposit, int noOfSpeakers){
          super(toyId, toyName, toyType, minAge, maxAge, price, quantity,rentalAmount, refundableDeposit);
      this.noOfSpeakers = noOfSpeakers;
      }
      @Override
      public String toString(){
        return "ToyName: "+getToyName()+"\nType: Musical Toy"+"\nSpeaker: "+noOfSpeakers;   
      }
}

public class Source 
{
    public static void main( String[] args )
	{
	    Scanner sc = new Scanner(System.in);
        int toyId,n,minAge,maxAge,numberOfBatteries,noOfSpeakers,price,quantity,refundableDeposit,rentalAmount;
        String toyName,toyType,operatingMode;
        
        n = 1;
        // sc.next();
        
        // Toy t = new Toy(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit);
        // Admin a = new Admin();
        if(n==1)
        {
        toyId = sc.nextInt();
        toyName = sc.nextLine();
        toyType = sc.next();
        minAge = sc.nextInt();
        maxAge = sc.nextInt();
        price = sc.nextInt();
        quantity = sc.nextInt();
        rentalAmount = sc.nextInt();
        refundableDeposit = sc.nextInt();
        numberOfBatteries = sc.nextInt();
        operatingMode = sc.next();
        ElectronicToy et = new ElectronicToy(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit,numberOfBatteries, operatingMode);
        System.out.println(et);
        }
        else if(n==2)
        {
            toyId = sc.nextInt();
        toyName = sc.nextLine();
        toyType = sc.nextLine();
        minAge = sc.nextInt();
        maxAge = sc.nextInt();
        price = sc.nextInt();
        quantity = sc.nextInt();
        rentalAmount = sc.nextInt();
        refundableDeposit = sc.nextInt();
        noOfSpeakers = sc.nextInt();
        MusicalToy mt = new MusicalToy(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit,noOfSpeakers);
        System.out.println(mt);
        }
	    
	}
}
