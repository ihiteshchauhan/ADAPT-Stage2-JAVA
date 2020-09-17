//IMPORT HERE
import java.util.*;
public class Source {
	
	public static void main(String[] args) {
	//CODE HERE
	Scanner sc = new Scanner(System.in);
	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();
	List<Integer> new_list = new ArrayList<Integer>();
	for(int i=0;i<5;i++)
	{
	    l1.add(sc.nextInt());    
	}
	for(int i=0;i<5;i++)
	{
	    l2.add(sc.nextInt());    
	}
	new_list = mergeAndSort(l1,l2);
	System.out.println(new_list);
	}

	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) 
	{
	//CODE HERE	
	List<Integer> merge_list = new ArrayList<Integer>();
	List<Integer> final_list = new ArrayList<Integer>();
	merge_list.addAll(al1);
	merge_list.addAll(al2);
	Collections.sort(merge_list);
	final_list.add(merge_list.get(2));
	final_list.add(merge_list.get(6));
	final_list.add(merge_list.get(8));
	return final_list;
	}
	
}

