import java.io.*;
import java.util.*;
public class Source {

    public void addItem(ArrayList<String> groceryList, String item) {
        groceryList.add(item);
    }
    
    public String modifyItem(ArrayList<String> groceryList, int index, String newItem) {
        groceryList.set(index, newItem);
        return "Item of index "+ index +" has been modified.";
        
    }
    
    public String removeItem(ArrayList<String> groceryList, int index) {
        groceryList.remove(index);
        return "Item of index "+ index +" has been removed.";
        
    }
    
    public String searchItem(ArrayList<String> groceryList, String searchItem) {
        if(groceryList.contains(searchItem))
            return searchItem;
        return "no such item";
    }
    
    public int getSize(ArrayList<String> groceryList) {
        return groceryList.size();
        
    }
    
    public static void main(String args[]) {
        ArrayList<String> groceryList = new ArrayList<String>();
        String mod, rem, search;
        Source s = new Source();
       int size;
       s.addItem(groceryList, "Fruit");
       s.addItem(groceryList, "Vegetable");
       s.addItem(groceryList, "Beverages");
       mod = s.modifyItem(groceryList, 1, "Fruitss");
       System.out.println(mod);
       rem = s.removeItem(groceryList, 1);
       System.out.println(rem);
       search = s.searchItem(groceryList, "Beverages");
       System.out.println(search);
       size = s.getSize(groceryList);
       System.out.println(size);
    }   
}
