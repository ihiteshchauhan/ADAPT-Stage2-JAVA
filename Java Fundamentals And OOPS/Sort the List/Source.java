import java.util.*;
public class Source {
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 String str = in.nextLine();
 List<String> list;
 list = sort(str);
 System.out.print(list);
}
public static List<String> sort(String str)
{
 List<String> elist = Collections.emptyList();
 if(str == null)
 return elist;
 String spstr[] = str.split(" ");
 List<String> list = Arrays.asList(spstr);
 Collections.sort(list);
 return list;
}
}

