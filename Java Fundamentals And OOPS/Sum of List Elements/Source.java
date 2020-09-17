import java.util.*;
public class Source {
 public List<Integer> getSumOfListElements(List<Integer> first,List<Integer> second){
 //CODE HERE
 List<Integer> third = new ArrayList<Integer>();
 int a,b,c,i;
 if(first ==null && second == null)
 return third;
 else if(first == null)
 {
 return second;
 }
 else if (second == null)
 return first;
 a = first.size();
 b = second.size();
 if(a<b)
 {
 c = a;
 }
 else
 c = b;
 for(i=0;i<c;i++)
 {
 third.add(first.get(i)+second.get(i));
 }
 for(i=c;i<a;i++)
 {
 third.add(first.get(i));
 }
 for(i=c;i<b;i++)
 {
 third.add(second.get(i));
 }
 return third;
 }
 public static void main(String[] args) {
 //CODE HERE
 List<Integer> first = new ArrayList<Integer>();
 List<Integer> second = new ArrayList<Integer>();
 Scanner sc = new Scanner(System.in);
int i,ele;
 String a[] = sc.nextLine().split(", ");
 a = a[0].split(" ");
 for(i=0;i<a.length;i++)
 first.add(Integer.parseInt(a[i]));
 a = sc.nextLine().split(", ");
 a = a[0].split(" ");
 for(i=0;i<a.length;i++)
 second.add(Integer.parseInt(a[i]));
 // System.out.print(first);
 // System.out.print(second);
 System.out.print(new Source().getSumOfListElements(first,second));
 // getSumOfListElements(first,second)
 }
}
