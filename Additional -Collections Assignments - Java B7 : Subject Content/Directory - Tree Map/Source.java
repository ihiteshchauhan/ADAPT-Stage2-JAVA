import java.util.Map;
import java.util.TreeMap;

class Source {

    private static TreeMap<String,String> data; //use data to  perform all the TreeMap functions...

    public Source() {
        //Intialze the TreeMap here....
        data = new TreeMap<String,String>();
    }

    public String getNumber( String name ) {
        //Return the number correspoinding to the name else return null...
        if(data.containsKey(name)){
        return data.get(name);
        }
        
        return null;
    }
    public boolean getName(String number){
         //Return true if number correspoinding to a name in the TreeMap else return false.
         if(data.containsValue(number)){
         return true;
         }
         return false;
    }


    public String putNumber( String name, String number ) {
      // Add the (name,number) pair into TreeMap and return the string "True"
      // ELSE throw an exception with the message "Name or Number: NULL Exception"
      
      if(name!=null && number!=null){
          data.put(name, number);
      }
      else{
          return "Name or Number: NULL Exception";
      }
      return "True";
      
    }

    public TreeMap<String,String> print() {
            //Return the TreeMap.
            return data;
    }
    public static void main(String[] args) {
        
        // Implement the method calls listed in the problem description to arrive at the Sample Output
            Source directory = new Source();   
                System.out.println(directory.putNumber("A1","1111"));
                System.out.println(directory.putNumber("A2","2222"));
                System.out.println(directory.putNumber("A3","3333"));
                System.out.println(directory.print());
                System.out.println(directory.getNumber("A1"));
                System.out.println(directory.getNumber("A2"));
                System.out.println(directory.getNumber("A3"));
    }
}


