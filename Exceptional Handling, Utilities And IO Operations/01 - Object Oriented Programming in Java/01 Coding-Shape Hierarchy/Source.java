import java.util.*;
interface Shape{
 double getArea();
 double getPerimeter();
}
abstract class AbstractShape implements Shape{
 private String colour;

 AbstractShape(String colour){
 this.colour=colour;
 }
 // public String getColour(){
 // return colour;
 // }

 public String toString()
 {
 return "colour="+colour;
 }
}
class Rectangle extends AbstractShape{
 private int length, breadth;

 Rectangle(String colour, int length, int breadth){
 super(colour);
 this.length = length;
 this.breadth = breadth;
 }

 public double getArea(){
 return length*breadth;
 }
 public double getPerimeter(){
 return 2*(length+breadth);
 }

 public String toString(){
 return "Rectangle ["+super.toString()+", length="+length+", breadth="+breadth+"]";
 }
}
class Circle extends AbstractShape{
 private int radius;

 Circle(String colour, int radius){
 super(colour);
 this.radius = radius;
 }
 public double getArea(){
 return Math.PI*radius*radius;
 }
 public double getPerimeter(){
 return 2*Math.PI*radius;
 }
 public String toString(){
 return "Circle ["+super.toString()+", radius="+radius+"]";
 }
}
class Source{
 public static void printShape(AbstractShape obj){
 if(obj instanceof Rectangle)
 {
 Rectangle r = (Rectangle) obj;
 System.out.println("Area:"+Math.round(r.getArea())+", Perimeter:"+Math.round(r.getPerimeter()));

 }
 if(obj instanceof Circle){
 Circle c = (Circle) obj;
 System.out.println("Area:"+Math.round(c.getArea())+", Perimeter:"+Math.round(c.getPerimeter()));
 }
 }
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 String shape = sc.next();
 if(shape.equals("CIRCLE")){
 String colour = sc.next();
 int radius = sc.nextInt();
 AbstractShape as = new Circle(colour, radius);
 Circle c = new Circle(colour, radius);
 System.out.println(c);
 printShape(as);


 }
 if(shape.equals("RECTANGLE")){
 String colour = sc.next();
 int length = sc.nextInt();
 int breadth = sc.nextInt();
 AbstractShape as = new Rectangle(colour, length, breadth);
 Rectangle r = new Rectangle(colour, length, breadth);
 System.out.println(r);
 printShape(as);

 }

 }
}
