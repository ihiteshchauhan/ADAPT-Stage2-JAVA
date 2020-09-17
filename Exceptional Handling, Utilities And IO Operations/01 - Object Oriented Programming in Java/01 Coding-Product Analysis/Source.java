import java.util.*;
//DO NOT EDIT THIS CLASS
class Product {
private int prodCode;
private String prodName;
private double price;
private String category;
public Product(int prodCode, String prodName, double price, String category) {
this.prodCode = prodCode;
this.prodName = prodName;
this.price = price;
this.category = category;
}
public int getProdCode() {
return prodCode;
}
public void setProdCode(int prodCode) {
this.prodCode = prodCode;
}
public String getProdName() {
return prodName;
}
public void setProdName(String prodName) {
this.prodName = prodName;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public String getCategory() {
return category;
}
public void setCategory(String category) {
this.category = category;
}
}
//DO NOT EDIT THIS CLASS
class ProductData {
private static Product[] products;
static {
products = new Product[8];
products[0] = new Product(101, "keyboard", 300, "computers");
products[1] = new Product(102, "mouse", 600, "computers");
products[2] = new Product(103, "monitor", 5000, "computers");
products[3] = new Product(104, "t-shirt", 500, "clothing");
products[4] = new Product(105, "jeans", 2000, "clothing");
products[5] = new Product(106, "sweater", 1000, "clothing");
products[6] = new Product(107, "doll", 500, "toys");
products[7] = new Product(108, "car", 1000, "toys");
}
public static Product[] getProducts() {
return products;
}
}
class ProductService
{
 //CODE HERE
 public static String findNameByCode(int prodcode){
 Product[] myproducts = ProductData.getProducts();
 for(Product p: myproducts){
 if(p.getProdCode()==prodcode)
 return p.getProdName();
 }
 return null;

 }
 public static Product findMaxPriceProduct(String Category){
 Product[] myproducts = ProductData.getProducts();
 Product result=null;
 double price=0;
 for(Product p:myproducts)
 {
 if(Category.equalsIgnoreCase(p.getCategory()) && price<p.getPrice()){
 result = p;
 price=p.getPrice();
 }
 }
 return result;
 }
}
public class Source{
 public static void main(String [] args){
 //CODE HERE
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 // Product[] mypro = ProductData.getProducts();
 // System.out.println(mypro[0]);
 if(n==1)
 {
 int prodcode = sc.nextInt();
 String result = ProductService.findNameByCode(prodcode);
 if(result!=null)
 {
 System.out.println(result);
 }
 else{
 System.out.println("Product Not Found");
 }
 }
 else if(n==2)
 {
 String category = sc.next();
 Product p = ProductService.findMaxPriceProduct(category);
 if(p!=null)
 {
 System.out.println(p.getProdCode()+" | "+p.getProdName()+" | "+p.getPrice());
 }
 else{
 System.out.println("No products in given category");
 }
 }
 else{
 System.out.println("Invalid choice");
 }
 }
}
