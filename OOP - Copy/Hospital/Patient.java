package Hospital;

import java.util.ArrayList;

public class Patient extends Person{

    protected String illness;
    protected String medicalhistory;       
    protected String allergy;
    protected String addmission;
    protected ArrayList <String> medicine= new ArrayList<String>();
    public Patient (){
    }

    public Patient(String name){
        this.name = name;
    }

    public Patient(String illness, String medicalhistory, String allergy, String addmission, String name, double age, int phonenumber, String gender) {
        super(name, age, phonenumber, gender);
        this.illness = illness;
        this.medicalhistory = medicalhistory;
        this.allergy = allergy;
        this.addmission = addmission;
    }
    

    public String getIllness() {
        return illness;
    }

    public void modifyIllness(String illness) {
        this.illness = illness;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public void modifyMedicalhistory(String medicalhistory) {
        this.medicalhistory = medicalhistory;
    }

    public String getAllergy() {
        return allergy;
    }

    public void modifyAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getAddmission() {
        return addmission;
    }

    public void modifyAddmission(String addmission) {
        this.addmission = addmission;
    }
    void addmedicine (String med){
      medicine.add(med);
    }
    void removemedicine(String med){
        medicine.remove(med);
    }

    @Override
    public String toString() {
        return "patient details{" +"name="+name+",age= "+age+",phonemumber="+phonenumber+",gender="+gender+ "illness=" + illness + ", medicalhistory=" + medicalhistory + ", allergy=" + allergy + ", addmission=" + addmission + ", medicine=" + medicine + '}';
    
}
    
}
