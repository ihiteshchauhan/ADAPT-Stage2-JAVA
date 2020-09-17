import java.util.Scanner;

class Toy
{
  private int toyId,minAge,maxAge,price,quantity,refundableDeposit,rentalAmount;
  private String toyName,toyType;
  
  public Toy() {
  }
  
   public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, int price, int quantity,int rentalAmount, int refundableDeposit)
   {
        
    this.toyId=toyId;
     this.toyName = toyName;
     this.toyType = toyType;
    this.minAge = minAge;
    this.maxAge = maxAge;
   
    this.price = price;
     this.quantity = quantity;
    
   this.rentalAmount = rentalAmount;
    this.refundableDeposit = refundableDeposit;
   
  }
  
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
  public int getPrice() {
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
 
}

//------------------------------------------------------------------------

class Customer
{
  private int customerId;
  private String customerName;
  private String email;
  private String password;
  private String address;
//public Customer(){
  //    
//   }
  public Customer(int customerId, String customerName, String email, String password, String address) {
//     super();
    this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.address = address;
        this.email = email;
  }
  public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }

}

//------------------------------------------------------------------------
interface CustomerService
{
    void rent(int toyId);
    void display();
  
}

//-------------------------------------------------------------------------

class CustomerServiceImpl extends Toy implements CustomerService
{
  public static Toy availableToys[]=new Toy[4];
  public Toy customerToysRentalInfo[]=new Toy[2];
  int k=0;
  
  CustomerServiceImpl()
  {
    	availableToys[0]=new Toy(120,"Rubber Ducky","Toy",1,3,200,200,20,200);
    	availableToys[1]=new Toy(130,"Car","Toy",1,5,100,30,20,100);
	    availableToys[2]=new Toy(150,"Kite","Toy",3,8,100,20,100,50);
	    availableToys[3]=new Toy(180,"Airplane","Toy",4,7,500,30,50,20);
  }
  public void rent(int toyd)
  {
      //k=0;
      for(int j=0;j<4;j++){
          if(toyd==availableToys[j].getToyId()){
              customerToysRentalInfo[k]=availableToys[j];
              
          }
          
      }
     
  }
  
  
  public void display()
  {
      
          
            System.out.print("Toy Name: "+customerToysRentalInfo[k].getToyName()+"\n");
            System.out.print("Toy Type: "+customerToysRentalInfo[k].getToyType()+"\n");
            System.out.print("Quantity: "+customerToysRentalInfo[k].getQuantity()+"\n");
            System.out.print("RentalAmount: "+customerToysRentalInfo[k].getRentalAmount());
          
    }
  }


//-------------------------------------------------------------------------

public class Source {
    public static void main( String[] args )
	{
	    Scanner sc=new Scanner(System.in);
	    CustomerServiceImpl c=new CustomerServiceImpl();
	    int n=sc.nextInt();
	    c.rent(n);
	    c.display();
	    
	}
}
		 
