import java.util.*;
class Employee {
  String name;
  double salary;
  Integer id;
  String designation;
 String InsuranceScheme;
 
 public Employee(){
     
 }

  public Employee(String name, double salary, Integer id, String designation) {
    //parameterized constructor
    this.name = name;
    this.salary = salary;
    this.id = id;
    this.designation = designation;
  }

  public String getInsuranceScheme(double salary) {
    /*  write your code here to return the scheme on the basis of salary
     if nothing falls in the range return null */
     if(salary<5000){
         return "no scheme";
     }
    else if(salary>=5000 && salary<20000){
         return "scheme c";
    }
    else if(salary>=20000 && salary<40000){
         return "scheme b";
    }
    else if(salary>=40000){
         return "scheme a";
    }
    return null;
     }
     
    //  @Override
    //  public String toString(){
    //     return "Name: "+name+"Id: "+id+"Salary: "+salary+" Designation: "+designation;
         
    //  }
}


class EmployeeServiceImpl {
  //Declare a Hashmap here where key is an Integer and the value is Employee object
  public static HashMap<Integer, Employee> empmap = new HashMap<Integer, Employee>();
  public static void addEmployee(Employee emp) {
    //write your code here to add employee to the hashmap 
    empmap.put(emp.id,emp);
  }

  public static boolean deleteEmployee(int id){
    //write your code here for returning true if the employee deleted wrt the id passed else false
    if(empmap.containsKey(id)){
    empmap.remove(id);
    return true;
    }
    return false;
  }

  public static String showEmpDetails(String InsuranceScheme) {
    /*Write your code here to return a string i.e the employee details according to the insurance scheme
    Format: Name: name Id: id Salary: salary Designation: Designation InsuranceScheme: InsuranceScheme
    If multiple results they should be in a different line*/
	  boolean flag = true;
	  String str = "";
	  for (Map.Entry mapElement : empmap.entrySet()) { 
          Employee obj = ((Employee)mapElement.getValue()); 
          if(InsuranceScheme.equals(obj.getInsuranceScheme(obj.salary))){
        	  flag = false;
        	  str+= "Name: "+obj.name+" Id: "+obj.id+" Salary: "+obj.salary+" Designation: "+obj.designation+" InsuranceScheme: "+InsuranceScheme;
      } 
  }
	  if(flag) {
		  return null;
	  }
	  return str;
}
}
public class Source{
    public static void main(String[] args){
        Employee emp1 = new Employee("hitesh", 30000, 132, "Engineer");
        Employee emp2 = new Employee("shruti", 40000, 112, "Doctor");
        Employee emp3 = new Employee("shivam", 50000, 122, "Developer");
        
        EmployeeServiceImpl e = new EmployeeServiceImpl();
        e.addEmployee(emp1);
        e.addEmployee(emp2);
        e.addEmployee(emp3);
        
    //     Set set2 = e.empmap.entrySet();
    //   Iterator iterator2 = set2.iterator();
    //   while(iterator2.hasNext()) {
    //       Map.Entry mentry2 = (Map.Entry)iterator2.next();
    //       System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
    //       System.out.println(mentry2.getValue());
    //   }
    
//    String scheme = emp1.getInsuranceScheme(40000);
//    System.out.println(scheme);
    
    
    // if(e.deleteEmployee(142)){
    //   Set set2 = e.empmap.entrySet();
    //   Iterator iterator2 = set2.iterator();
    //   while(iterator2.hasNext()) {
    //       Map.Entry mentry2 = (Map.Entry)iterator2.next();
    //       System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
    //       System.out.println(mentry2.getValue());
    //   }}
    //   else{
    //       System.out.println("Key not found");
    //   }
    String scheme = "scheme c";
    System.out.println(e.showEmpDetails(scheme));
    
        
    }
}
