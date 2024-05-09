package Hospital;

import java.util.ArrayList;

public class Patient extends Person{

        //class attributes
        protected String illness;
        protected String medicalhistory;       
        protected String allergy;
        protected String admission;
        protected ArrayList <String> medicine;
        protected Doctor doctor;
        // no argument constructor
        public Patient (){
        this.medicine = new ArrayList <String>();

        }
        //argumentative constructor
        public Patient(String name, double age, int phonenumber, String gender,String illness, String medicalhistory, String allergy, String admission ) {
        super(name, age, phonenumber, gender);
        this.illness = illness;
        this.medicalhistory = medicalhistory;
        this.allergy = allergy;
        this.admission = admission;
        this.medicine = new ArrayList <String>();
    
        }
    
        
        // method to get illness
            public String getIllness() {
            return illness;
        }
    
        // method to modify illness
        public void modifyIllness(String illness) {
            this.illness = illness;
        }
        // method to get medical history 
        public String getMedicalhistory() {
            return medicalhistory;
        }
        // method to modify medical history
        public void modifyMedicalhistory(String medicalhistory) {
            this.medicalhistory = medicalhistory;
        }
        //method to get the allergy of the patient
        public String getallergy() {
            return allergy;
        }
        // method to modify the allergy
        public void modifyallergy(String allergy) {
            this.allergy = allergy;
        }
        // method to get the admission
        public String getAdmission() {
            return admission;
        }
        // method to modify admission
        public void modifyAdmission(String addmission) {
            this.admission = addmission;
        }
        // method to add medicine to the patient
        void addmedicine (String med){
          medicine.add(med);
        }
        // method to remove medicine
        void removemedicine(String med){
            medicine.remove(med);
        }
        public Doctor getDoctor() {
            return doctor;
        }
    
        public void setDoctor(Doctor doctor) {
            this.doctor = doctor;
        }
    
    
        // method to print all patient's information
        @Override
        public String toString() {
            return "patient{" +"name="+name+",age= "+age+",phonemumber="+phonenumber+",gender="+gender+ "illness=" + illness + ", medicalhistory=" + medicalhistory + ", allergy=" + allergy + ", addmission=" + admission + ", medicine=" + medicine + '}';
        }
    
    }

