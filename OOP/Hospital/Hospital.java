package Hospital;

import java.util.ArrayList;

public class Hospital {

    //Attributes of class hospital

    private String Name;
    private String Address;
    private String PhoneNumber;
    private double HospitalFees;


    protected ArrayList<Patient> patients;
    protected ArrayList<Doctor> doctors;
    protected ArrayList<Nurse> nurses;
    protected ArrayList<Room> rooms;
    protected ArrayList<Surgery> surgeries;


    //Default Constructor
    public Hospital(){
        this.patients = new ArrayList<Patient>();
        this.doctors = new ArrayList<Doctor>();
        this.nurses = new ArrayList<Nurse>();
        this.rooms = new ArrayList<Room>();
        this.surgeries = new ArrayList<Surgery>();

    }


    //Arguement Constructor
    public Hospital(String Name,String Address,String PhoneNumber,double HospitalFees,int NumOfRooms,int NumOfDoctors,int NumOfNurses,int NumOfPatients){
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.HospitalFees = HospitalFees;
     

        this.patients = new ArrayList<Patient>();
        this.doctors = new ArrayList<Doctor>();
        this.nurses = new ArrayList<Nurse>();
        this.rooms = new ArrayList<Room>(); 
        this.surgeries = new ArrayList<Surgery>();
    }


    // Setters
    public void setName(String Name) {
        this.Name = Name;}
        

    public void setAddress(String Address) {
        this.Address = Address;
    }


    public void setPhoneNumber(String PhoneNumber) {
        //Checks if all the characters in the phone number are digits
        for (int i = 0; i < PhoneNumber.length(); i++) {
            if (!Character.isDigit(PhoneNumber.charAt(i))) {
                System.out.println("Phone number can only contain digits.");}
            else{
                this.PhoneNumber = PhoneNumber;
        }
    }
}


    public void setHospitalFees(double HospitalFees){
        //Checks that Hospital Fees aren't in negative 
        if(HospitalFees<0){
            System.out.println("Error, Invalid Hospital Fee");
        }
        else{
            this.HospitalFees = HospitalFees;
    }
}

    // Getters
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public double getHospitalFees(){
        return HospitalFees;
    }

    public int getNumOfRooms() {
        return rooms.size();
    }

    public int getNumOfDoctors() {
        return doctors.size();
    }

    public int getNumOfNurses() {
        return nurses.size();
    }

    public int getNumOfPatients() {
        return patients.size();
    }


    public double HospitalPatientFees(double HospitalFees){
        //Returns hospital fee summed with a fixed tax precentage
        double tax = 0.14;
        double HospitalPatientFees = this.HospitalFees + (this.HospitalFees*tax);
        return HospitalPatientFees;
    }

    

    //Search Patient method used to search for a patient by name in the ArrayList of Patient 
    public void SearchPatient(String PatientName){

        //Checks to see if the ArrayList is empty and returns that there aren't patients if true
        if(patients.isEmpty()){
            System.out.println("There are no patients in the hospital");}
        else{

            //Checks one by one each patient in the array for the one that has the entered Patient name
            for(Patient p:patients){
                if(p.getName().equalsIgnoreCase(PatientName)){
                    System.out.println("Patient " + PatientName+" is in this hospital\n");

                    //Prints the patient details
                    System.out.println(p.toString());
                    return;
            } 
        }
        //If it doesn't find patient in the array, it prints that the patient isn't in the hospital
        System.out.println("Patient " + PatientName+" isn't in this hospital"); 
        }
    }


    //Method used to add a a new patient in the arraylist by creating new patient objects
    public void AddPatient(Patient patient){
        
        patients.add(patient);
        System.out.println("Patient Added Successfully!");
    }


    //Method used to remove a patient from the Arraylist of patients
    public void RemovePatient(String PatientName){

        //Checks to see if the ArrayList is empty since you can't remove from nothing
        if (patients.isEmpty()) {
            System.out.println("No patients in the hospital to remove.");
        }
        else{

            //Checks for each patient in the ArrayList for the one with the matching name so it can remove it
            for (Patient p: patients) {
                if (p.getName().equalsIgnoreCase(PatientName)) {
                    patients.remove(p);

                    System.out.println("Patient " + PatientName + " removed from the hospital.");
                    return;
            }
        }
        //If it doesn't find the patient, it returns that he isn't in this hospital
        System.out.println("Patient with name " + PatientName + " not found in the hospital.");
    }
}


     //Method used to add a a new doctor to the arraylist by creating a new doctor object
    public void AddDoctor(Doctor doctor){
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }
    

    //Method used to remove a doctor from the arraylist
    public void RemoveDoctor(String DoctorName){

        if (doctors.isEmpty()) {
            System.out.println("No doctors in the hospital to remove.");
        }
        else{

            //Checks for each patient in the ArrayList for the one with the matching name so it can remove it
            for (Doctor d: doctors) {
                if (d.getName().equalsIgnoreCase(DoctorName)) {
                    doctors.remove(d);

                    System.out.println("Doctor " + DoctorName + " removed from the hospital.");
                    return;
            }
        }
        //If it doesn't find the patient, it returns that he isn't in this hospital
        System.out.println("Doctor with name " + DoctorName + " not found in the hospital.");
    }
    }


    //Method used to add a a new nurse to the arraylist by creating a new nurse object
    public void AddNurse(Nurse nurse){
        nurses.add(nurse);
        System.out.println("Nurse added successfully");
    }


    //Method used to remove a nurse from the arraylist
    public void RemoveNurse(String NurseName){

        if (nurses.isEmpty()) {
            System.out.println("No nurses in the hospital to remove.");
        }
        else{

            //Checks for each patient in the ArrayList for the one with the matching name so it can remove it
            for (Nurse n: nurses) {
                if (n.getName().equalsIgnoreCase(NurseName)) {
                    nurses.remove(n);

                    System.out.println("Nurse " + NurseName + " removed from the hospital.");
                    return;
            }
        }
        //If it doesn't find the patient, it returns that he isn't in this hospital
        System.out.println("Nurse with name " + NurseName + " not found in the hospital.");
    }
    }


    //Method used to add a a new room to the arraylist by creating a new room object
    public void AddRoom(Room room){
        rooms.add(room);
        System.out.println("Room added successfully");
    }


    //Method used to remove a nurse from the arraylist
    public void RemoveRoom(int RoomNumber){

        if (rooms.isEmpty()) {
            System.out.println("No rooms in the hospital to remove.");
        }
        else{

            //Checks for each patient in the ArrayList for the one with the matching name so it can remove it
            for (Room r: rooms) {
                if (r.getRoomNumber() == RoomNumber) {
                    rooms.remove(r);
               

                    System.out.println("Room " + RoomNumber + " removed from the hospital.");
                    return;
            }
        }
        //If it doesn't find the patient, it returns that he isn't in this hospital
        System.out.println("Room with number " + RoomNumber+ " not found in the hospital.");
    }
    }

    
    //Method used to print the details of the Hospital
    public void printDetails(){
        System.out.println("Hospital information\nHospital Name:"+Name+"\nHospital Address:"+Address+"\nPhone Number"+PhoneNumber+"\nNumber of Doctors"+getNumOfDoctors()+"\nNumber of Nurses"+getNumOfNurses()+"\nNumber of Patients"+getNumOfPatients()+"\nNumber of Rooms"+getNumOfRooms());
    }

    public void assignPatientToDoctor(String PatientName, String DoctorName) {
        Doctor doctor = null;
        for (Doctor d : doctors) {
            if (d.getName().equals(DoctorName)) {
                doctor = d;
                break;
            }
        }
    
        // Find the patient by name
        Patient patient = null;
        for (Patient p : patients) {
            if (p.getName().equals(PatientName)) {
                patient = p;
                break;
            }
        }
    
        // Assign patient to doctor if both are found
        if (doctor != null && patient != null) {
            doctor.assignPatient(patient);
            patient.setDoctor(doctor);
            System.out.println(patient.getName() + " assigned to " + doctor.getName());
        } else {
            System.out.println("Invalid patient or doctor");
        }
    }

    
    
     
     public void reserveSurgery(Surgery s){
        surgeries.add(s);
        System.out.println("Surgery reserved successfully");
     }

     public void cancelSurgery(Surgery s){
        if (surgeries.isEmpty()) {
            System.out.println("No Surgerys scheduled");
        }
        else{
            for (Surgery S: surgeries) {
            if(s.equals(S)){
            surgeries.remove(s);
            System.out.println("Surgery removed successfully");
            return;
     }
 
}
    System.out.println("Surgery not found");
 }
}

    public void printSurgeries(){
        for (Surgery s : surgeries) {
            System.out.println(s);
        }
    }
     }
    