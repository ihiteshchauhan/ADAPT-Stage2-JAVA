
import java.util.*;
class Doctor{
	private String name;
	 private String speciality;
	 private int experience;
	 Doctor(String n, String s, int exp)
	 {
	 this.name = n;
	 this.speciality = s;
	 this.experience = exp;
	 }
	 String getName()
	 { return this.name; }
	 String getSpec()
	 { return this.speciality; }
	 int getExp()
	 { return this.experience; }
	 
	 @Override
	 public String toString()
	 {
		 return name + " " + speciality + " " + experience;
	 }
}

class DoctorService
{
 private List<Doctor> doctorsRepository; // DON'T MODIFY THIS
 //DONT MODIFY THIS
 public DoctorService(List<Doctor> doctorsRepository)
 {
 this.doctorsRepository = doctorsRepository;
 }
 
 public List<Doctor> getExperiencedDoctors(int exp){
	 List<Doctor> expdoc = new ArrayList<Doctor>();
	 for(Doctor d: doctorsRepository)
	 {
		 if(d.getExp()>=exp)
		 {
			 expdoc.add(d);
		 }
	 }
	 Collections.sort(expdoc, new Comparator<Doctor>() {
		 @Override
		 public int compare(final Doctor d1, final Doctor d2) {
			 int c;
			 c = d1.getSpec().compareTo(d2.getSpec());
			 if(c==0)
				 c=d2.getExp() - d1.getExp();
		 return c;
		 }
	 });
//			 (d1, d2) -> d1.getSpec().compareTo(d2.getSpec()));
	 return expdoc;
 }

 public Set<Doctor> getSpecialityDoctor(String spec){
	 List<Doctor> specdoc = new ArrayList<Doctor>();
	 for(Doctor d: doctorsRepository)
	 {
		 if(d.getSpec().equalsIgnoreCase(spec))
		 {
			 specdoc.add(d);
		 }
	 }
	 Collections.sort(specdoc, (d1, d2) -> d1.getName().compareTo(d2.getName()));
	 Set<Doctor> specset = new LinkedHashSet<Doctor>(specdoc);
	 return specset;
 }
 
}

public class Source
{
 private static String doctorsData; //DON'T MODIFY THIS
 //DON'T MODIFY THIS
 static {
 StringBuilder doctors = new StringBuilder();
 doctors.append("Amy-Pediatrics-16;");
 doctors.append("John-Dermatology-10;");
 doctors.append("David-Dermatology-15;");
 doctors.append("Bob-Pediatrics-6;");
 doctors.append("Cathy-Dermatology-5;");
 doctors.append("Mavis-Pediatrics-11;");
 doctors.append("Robin-Pediatrics-7;");
 doctors.append("Minty-Dermatology-9;");
 doctors.append("Jim-Cardiology-25;");
 doctorsData = doctors.toString();
 }
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 List<Doctor> DocData = new ArrayList<Doctor>();
 String docList[] = doctorsData.split(";");
 for(int i=0;i<docList.length;i++) {
	 String data[] = docList[i].split("-");
	 DocData.add(new Doctor(data[0],data[1],Integer.parseInt(data[2])));
 }
 DoctorService ds = new DoctorService(DocData);
 int n = in.nextInt();
 if(n==1)
 {
	 int exp = in.nextInt();
	 List<Doctor> result = ds.getExperiencedDoctors(exp);
	 if(!result.isEmpty())
     {
     for(Doctor ed :result)
     {
         System.out.println(ed);
     }
     }
     else{
         System.out.println("No Doctors Found");
     }
 }
 else if(n==2)
 {
	 String spec = in.next();
	 Set<Doctor> result = ds.getSpecialityDoctor(spec);
	 if(!result.isEmpty())
     {
     for(Doctor ed :result)
     {
         System.out.println(ed);
     }
     }
     else{
         System.out.println("No Doctors Found");
     }
	 
 }
 else {
	 System.out.println("Invalid Choice");
 }
 }
}
