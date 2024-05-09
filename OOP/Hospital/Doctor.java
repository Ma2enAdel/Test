package Hospital;
import java.util.ArrayList;

public class Doctor extends Employee {

protected String Specialization;
   protected int YearsofExperice;
   protected ArrayList <Patient> assignedPatients ;
   
   public Doctor (){
    this.assignedPatients = new ArrayList<>();
   }

   public Doctor( String name, double age, int phonenumber, String gender,int id, String dateofhiring, String jobpostion, int salary,String Specialization, int YearsofExperice ) {
       super(name, age, phonenumber, gender,id, dateofhiring, jobpostion, salary );
       this.Specialization = Specialization;
       this.YearsofExperice = YearsofExperice;
       this.assignedPatients = new ArrayList<>();
   }
   public Doctor (String name){
       this.name=name;
       this.assignedPatients = new ArrayList<>();
   }
   
   
   

   public String getSpecialization() {
       return Specialization;
   }

   public void setSpecialization(String Specialization) {
       this.Specialization = Specialization;
   }

   public double getYearsofExperice() {
       return YearsofExperice;
   }

   public void setYearsofExperice(int YearsofExperice) {
       this.YearsofExperice = YearsofExperice;
   }
   public void assignPatient (Patient e){
      assignedPatients.add(e);
   }
   
   public void print_assigned_pat(Patient e){
      System.out.println("Patient "+e.getName()+" Has been assigned to the Doctor");
   }

   @Override
   public String toString() {
       return "Doctor{" +"name="+name+",age= "+age+",phonemumber="+phonenumber+",gender="+gender+",id=" + id + ", dateofhiring=" + dateofhiring + ", jobpostion=" + jobpostion + ", salary=" + salary + "Specialization=" + Specialization + ", YearsofExperice=" + YearsofExperice + '}';
}

}
    

