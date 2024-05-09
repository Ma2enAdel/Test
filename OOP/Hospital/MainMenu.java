package Hospital;
import java.util.Scanner;

public class MainMenu {




        Scanner input = new Scanner(System.in);
        int choice;
    
        public void MainPrompt(){
    
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
    
            choice = input.nextInt();
            input.nextLine();
            
        }
    
        public void LoginPrompt(){
    
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Remove Patient");
            System.out.println("4. Assign patient to doctor");
            System.out.println("5. Scheduled Surgeries");
            System.out.println("6. Add Doctor");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Add Room ");
            System.out.println("9. Remove Room ");
            System.out.println("10. Room Reservation");
            System.out.println("11. Cancel Room Reservation");
            System.out.println("12. Add Nurse");
            System.out.println("13. Remove Nurse");
            System.out.println("14. Print Hospital details");
            System.out.println("15. Get Number of Rooms");
            System.out.println("16. Get Number of Nurses");
            System.out.println("17. Get Number of Doctors");
            System.out.println("18. Get Number of Patients");
            System.out.println("19. ReserveSurgery");
            System.out.println("20. Cancel Surgery");


            System.out.println("21. Go Back");
            System.out.print("Choose an option: ");
    
            choice = input.nextInt();
            input.nextLine();
    
        }
    
        public boolean LoginMenu(Hospital h){
            
            switch (choice){
    
                case 1: 
                System.out.print("Enter the following information\nName:");
    
                String name = input.nextLine();
                System.out.print("Illness:");
                String illness = input.nextLine();
                System.out.print("Medical History:");
                String medicalhistory = input.nextLine();
                System.out.print("Allergy:");
                String allergy = input.nextLine();
                System.out.print("Admission:");
                String admission = input.nextLine();
                System.out.print("Age:");
                double age  = input.nextDouble();
                System.out.print("Phone Number:");
                int phonenumber = input.nextInt();
                input.nextLine();

                System.out.print("Gender:");
                String gender = input.nextLine();
    
                h.AddPatient(new Patient( name,  age,  phonenumber,  gender, illness,  medicalhistory,  allergy,  admission));
                return true;
                
                case 2:
                System.out.print("Enter the name of the patient:");
                name = input.nextLine();
                h.SearchPatient(name);
                return true;
       
    
                case 3:
                System.out.print("Enter the name of the patient:");
                name = input.nextLine();
                h.RemovePatient(name);
                return true;
                
                case 4:
                System.out.print("Enter the patient Name:");
                
                String PatientName = input.nextLine();
          
                System.out.print("Enter the Doctor Name:");

                String DoctorName = input.nextLine();

                h.assignPatientToDoctor(PatientName,DoctorName);

               
                return true;
                 
                case 5 :
                h.printSurgeries();
                return true;

    
                    
                case 6:
                    System.out.print("Enter the following information\nName:");
                    name = input.nextLine();
                    System.out.print("Age:");
                    age = input.nextDouble();
                    input.nextLine();
                    System.out.print("Gender:");
                    gender = input.nextLine();
                    System.out.print("Phone Number:");
                    phonenumber = input.nextInt();
                    System.out.print("ID:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Date of hiring:");
                    String dateofhiring= input.nextLine();
                    System.out.print("Job postion:");
                    String jobpostion = input.nextLine();
                    System.out.print("Salary:");
                    int salary = input.nextInt();
                    input.nextLine();
                    System.out.print("Specialization:");
                    String Specialization= input.nextLine();
                    System.out.print("YearsofExperice:");
                    int YearsofExperice = input.nextInt();
                    
                    h.AddDoctor(new Doctor( name,  age,  phonenumber,  gender, id,  dateofhiring,  jobpostion,  salary, Specialization,  YearsofExperice));
                    return true;
                    
                case 7:
                    System.out.println("Enter the following information\nName:");
                    name = input.nextLine();
                    h.RemoveDoctor(name);
                    return true;
                     
                case 8:
                    System.out.print("Enter the following information\nRoomNumber");
                    int roomNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Room type");
                    String roomType = input.nextLine();
                    h.AddRoom(new Room( roomNumber,  roomType));
                    return true;
                    
                    
                case 9:
                    System.out.print("enter the following information\nRoomNumber:");
                    roomNumber = input.nextInt();
                    h.RemoveRoom(roomNumber);
                    return true;
                       
                case 10 :
                    System.out.print("Enter the following information\nRoomNumber:");
                    roomNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Type:");
                    roomType = input.nextLine();
                    boolean occupied = true; 
                    Room r =  new Room( roomNumber,  roomType);
                    r.setOccupied(occupied);
                    System.out.println("Room reserved successfully");
                    return true;
                
                    
                case 11:
                System.out.println("Enter the following information \nRoomnumber");
                roomNumber=input.nextInt();
                r = new Room(roomNumber);
                r.canceloccu();
                return true;

                case 12:
                System.out.print("Enter the following information\nName:");
    
                String name2 = input.nextLine();
                System.out.print("ID: ");
                int id2 = input.nextInt();
                System.out.print("Date of Hiring:");
                String dateofhiring2 = input.nextLine();
                input.nextLine();
                System.out.print("Job Position: ");
                String jobpos2 = input.nextLine();
                System.out.print("Salary:");
                int Salary2 = input.nextInt();
                System.out.print("Age:");
                double age2  = input.nextDouble();
                System.out.print("Phone Number: ");
                int phonenumber2 = input.nextInt();
                System.out.print("Years of Experience:");
                int YearsofExperice2 = input.nextInt();
                System.out.print("Department:");
                String department=input.next();

                input.nextLine();

                System.out.print("Gender:");
                String gender2 = input.nextLine();
                h.AddNurse(new Nurse(name2,age2,phonenumber2, gender2, id2, dateofhiring2, jobpos2, Salary2,department,YearsofExperice2));
                return true;
                    
               case 13:
               System.out.print("Enter the name of the Nurse:");
               name = input.nextLine();
               h.RemoveNurse(name);
               return true;

               case 14:
               h.printDetails();
               return true;

               case 15:
               System.out.println(h.getNumOfRooms());
               return true;

               case 16:
               System.out.println(h.getNumOfNurses());
               return true;

               case 17:
               System.out.println(h.getNumOfDoctors());
               return true;

               case 18:
               System.out.println(h.getNumOfPatients());
               return true;

            case 19:
            System.out.println("Enter surgery details:");
            System.out.print("Type: ");
            String type = input.nextLine();
            System.out.print("Day of the month: ");
            int day = input.nextInt();
            System.out.print("Number of staff: ");
            int noOfStaff = input.nextInt();

            h.reserveSurgery(new Surgery(type, day, noOfStaff));
            return true;

                case 20:
                System.out.println("Enter surgery details:");
                System.out.print("Type: ");
                String type1 = input.nextLine();
                System.out.print("Day of the month: ");
                int day1 = input.nextInt();
                System.out.print("Number of staff: ");
                int noOfStaff1 = input.nextInt();
                Surgery d = new Surgery(type1, day1, noOfStaff1);

                h.cancelSurgery(d);
                return true;

                case 21:
                System.out.println("Exiting");
                return false;
    
    
                default:
                System.out.println("Invalid input, Please try again");
                return true;
        }
    }
    
    

}

    

