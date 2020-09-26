// No need to implement main method as described in description

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public ArrayList<String> copy(ArrayList<String> a){
        ArrayList<String> b = (ArrayList<String>)a.clone();
        return b;
    }
    
    public String PrintIndex(ArrayList<String> a){
        return a.get(0);
    }
    
    public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
        // ArrayList<String> b = new ArrayList<String>();
        int index = a.indexOf(m);
        a.add(index+1,n);
        // for(int i=index;i<a.size();i++)
        // {
        //     b.add(a.get(i));
        // }
        return a;
    }
}
