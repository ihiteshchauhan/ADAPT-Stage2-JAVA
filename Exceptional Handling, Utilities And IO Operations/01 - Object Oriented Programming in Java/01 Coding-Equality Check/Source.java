class Customer {
 // STUDENT CODE BEGINS HERE
 private int customerId;
 private String name, city, phone, email;

 // Default constructor
 Customer(){
 this.customerId=0;
 this.name=null;
 this.city=null;
 this.phone=null;
 this.email=null;
 }
 //Parametrized constructor
 Customer(int customerId, String name, String city, String phone, String email)
 {
 this.customerId = customerId;
 this.name = name;
 this.city = city;
 this.phone = phone;
 this.email=email;
 }

 public void setCustomerId(int customerId){
 this.customerId = customerId;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public void setCity(String city)
 {
 this.city=city;
 }
 public void setPhone(String phone)
 {
 this.phone = phone;
 }
 public void setEmail(String email)
 {
 this.email = email;
 }
 public int getCustomerId(){
 return customerId;
 }
 public String getName(){
 return name;
 }
 public String getCity(){
 return city;
 }
 public String getPhone(){
 return phone;
 }
 public String getEmail(){
 return email;
 }

 @Override //Equals method
 public boolean equals(Object obj) {
 if (obj == this) {
 return true;
 }
 if (obj == null || obj.getClass() != this.getClass()) {
 return false;
 }
 Customer c = (Customer) obj;
 if(c.getCustomerId()==this.getCustomerId() && c.getName()==(this.getName()) &&
c.getCity()==(this.getCity()) && c.getPhone()==(this.getPhone()) && c.getEmail()==(this.getEmail()) && c!=null
&& this!=null){
 return true;
 }
 return false;
 }
 // STUDENT CODE ENDS HERE
}
class Source {
 public static void main(String []args){
 //STUDENT CODE HERE
 Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
 Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);
 System.out.println(c1.equals(c2));
 System.out.println(c2.equals(c1));
 c1.setEmail("vinod@mailinator.com");
 System.out.println(c1.equals(c2));
 System.out.println(c2.equals(c1));
 c2.setEmail("vinod@mailinator.com");
 System.out.println(c1.equals(c2));
 System.out.println(c2.equals(c1));
 Customer c3 = new Customer();
 Customer c4 = new Customer();
 System.out.println(c3.equals(c4));
 }
}
