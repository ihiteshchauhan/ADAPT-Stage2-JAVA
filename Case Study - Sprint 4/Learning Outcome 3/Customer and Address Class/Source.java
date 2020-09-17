import java.util.Scanner;
class Address{
    String city, state, country;
    int zip;
    public Address(String city, String state, int zip, String country){
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }
    public String getCountry(){
        return country;
    }
    @Override
    public String toString(){
        return getCity()+" "+getState()+" "+getZip()+" "+getCountry()+"";
    }
}

class Customer{
    int customerId;
    String customerName, password, email;
    Address a;
    public Customer(){
        
    }
    public Customer(int customerId, String customerName, String password, Address a, String email){
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.a = a;
        this.email = email;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(Address address){
        this.a = a;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public Address getAddress(){
        return a;
    }
    public int getCustomerId(){
        return customerId;
    }
    @Override
    public String toString(){
        return getCustomerId()+" "+getCustomerName()+" "+getPassword()+" "+getEmail()+"\n"+a.city+" "+a.state+" "+a.zip+" "+a.country;
    }
}
public class Source 
{
    public static void main( String[] args )
	{
	    Scanner sc = new Scanner(System.in);
	    int customerId = sc.nextInt();
	    String customerName = sc.next();
	    String password = sc.next();
	    String email = sc.next();
	    String city = sc.next();
	    String state = sc.next();
	    int zip = sc.nextInt();
	    String country = sc.next();
	    Address a= new Address(city, state, zip, country);
	    a.setCity(city);
	    a.setState(state);
	    a.setZip(zip);
	    a.setCountry(country);
	    Customer c = new Customer(customerId, customerName, password, a, email);
	    System.out.println(c);
	   // System.out.println(customerId+"-"+customerName+"-"+password+"-"+email+"-"+city+"-"+state+"-"+zip+"-"+country);
	}
}	 
