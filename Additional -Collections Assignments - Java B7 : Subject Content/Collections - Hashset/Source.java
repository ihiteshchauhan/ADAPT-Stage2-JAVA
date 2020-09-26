import java.util.*;

public class Source {
    public Set<Integer> union(Set<Integer> a, Set<Integer> b){
        Set<Integer> union = new HashSet<Integer>(a);  
        union.addAll(b);  
        return union;
    }
    public Set<Integer> subtract(Set<Integer> a, Set<Integer> b){
        Set<Integer> difference = new HashSet<Integer>(a);  
        difference.removeAll(b);   
        return difference;
    }
    public Set<Integer> intersect(Set<Integer> a, Set<Integer> b){
        Set<Integer> intersection = new HashSet<Integer>(a);  
        intersection.retainAll(b);  
        return intersection;
    }
    
   public static void main(String[] args){
       HashSet<Integer> set1 = new HashSet();
        set1.add(2);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet();
        set2.add(9);
        set2.add(2);
        Source s = new Source();
        System.out.println(s.subtract(set1, set2));
        System.out.println(s.union(set1, set2));
        System.out.println(s.intersect(set1, set2));
   }
}
